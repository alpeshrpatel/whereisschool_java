// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name: Template.java

package org.whereisschool.codegenerator.template;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.apache.oro.text.perl.Perl5Util;

public class Template {

    public Template() {
    }

    public Template(String s) {
        loaded_at = new Date();
        loaded_at.setTime(loaded_at.getTime());
        StringBuffer stringbuffer = new StringBuffer();
        filename = s;
        try {
            FileReader filereader = new FileReader(filename);
            BufferedReader bufferedreader = new BufferedReader(filereader);
            while ((template = bufferedreader.readLine()) != null)
                stringbuffer = stringbuffer.append(template + "\n");
            filereader.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
//            LogWriter.writeLog("Template Constructor", this.getClass()
//                    .getName(), fnfe);
        } catch (IOException ioexception) {
//            LogWriter.writeLog("Template Constructor", this.getClass()
//                    .getName(), ioexception);
        }
        template = stringbuffer.toString();
    }

    public String getTemplate() {
        return template;
    }

    public String patch(Map map) {
        Date date = new Date();
        File file = new File(filename);
        date.setTime(file.lastModified());
        String s = loaded_at.toString();
        s = date.toString();
        if (loaded_at.compareTo(date) < 0) {
            StringBuffer stringbuffer = new StringBuffer();
            try {
                FileReader filereader = new FileReader(filename);
                BufferedReader bufferedreader = new BufferedReader(filereader);
                while ((template = bufferedreader.readLine()) != null)
                    stringbuffer = stringbuffer.append(template + "\n");
                filereader.close();
            } catch (FileNotFoundException fnfe) {
              //  LogWriter.writeLog("patch", this.getClass().getName(), fnfe);
            } catch (IOException ioe) {
              //  LogWriter.writeLog("patch", this.getClass().getName(), ioe);
            }
            template = stringbuffer.toString();
        }
        template = patchMessage(template, map);
        return template;
    }

    public String patchMessage(String s, Map map) {
        if (s.equals(""))
            return "";
        template = s;
        Perl5Util perl5util = new Perl5Util();
        Set set = map.entrySet();
        for (Iterator iterator = set.iterator(); iterator.hasNext();) {
            java.util.Map.Entry entry = (java.util.Map.Entry) iterator.next();
            String s2 = new String();
            s2 = "s!__" + entry.getKey() + "__!"
                    + perl5util.substitute("s/!/\\!/sg", "" + entry.getValue())
                    + "!isg";
            template = perl5util.substitute(s2, template);
        }

        String s1 = "s!(__[^\\s].*?__)!!isg";
        template = perl5util.substitute(s1, template);
        return template;
    }

    public Map getAttribute() {
        Perl5Util perl5util = new Perl5Util();
        Map hashmap = new LinkedHashMap();
        try {
            FileReader filereader = new FileReader(filename);
            BufferedReader bufferedreader = new BufferedReader(filereader);
            for (String s = new String(); (s = bufferedreader.readLine()) != null;)
                if (perl5util.match("m/__([^\\s].*?)__/", s)) {
                    Vector vector = perl5util.split(s);
                    String as[] = (String[]) vector.toArray(new String[0]);
                    for (int i = 0; i < as.length; i++)
                        if (perl5util.match("m!__([^\\s].*?)__!", as[i])) {
                            as[i] = perl5util.substitute(
                                    "s!__([^\\s].*?)__!$1!", as[i]);
                            hashmap.put(as[i], "");
                        }
                }
            filereader.close();
        } catch (FileNotFoundException fnfe) {
          //  LogWriter.writeLog("getAttribute", this.getClass().getName(), fnfe);
        } catch (IOException ioe) {
          //  LogWriter.writeLog("getAttribute", this.getClass().getName(), ioe);
        }
        return hashmap;
    }

    private String template;

    private String filename;

    private Date loaded_at;
}