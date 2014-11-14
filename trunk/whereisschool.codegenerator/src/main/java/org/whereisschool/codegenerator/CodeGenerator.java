package org.whereisschool.codegenerator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.whereisschool.codegenerator.template.Template;
import org.whereisschool.codegenerator.util.CodeGeneratorConstant;
import org.whereisschool.codegenerator.util.CodeGeneratorUtil;

/**
 * CodeGenerator -i <txt(which will have all class name) or xml(future
 * ehancement) > -type <dao|service|pojo> -o <output directory>
 * 
 * @author apatel5
 * 
 */
public class CodeGenerator {

	private String outputFolderPath;

	public CodeGenerator() {

	}

	public CodeGenerator(String outputFolderPath) {
		this.outputFolderPath = outputFolderPath;
	}

	
	public boolean generateDAO(String path){
		
		
		List<String> daoClassList = getEntityClassName(path);
		
		for (Iterator<String> iterator = daoClassList.iterator(); iterator.hasNext();) {
			String className = iterator.next();
			if(className.indexOf("PK")!=-1) continue;
			generateDAOFile(className);
		}
		return true;
	}
	
	public boolean generateDAOFile(String strTableName) {
		String strOutputFileName = strTableName + "DAO.java";
		if (checkFileExist(outputFolderPath, strOutputFileName)) {
			return true;
		}

		String strTemplate = "./template" + File.separatorChar
				+ CodeGeneratorConstant.DAO_TEMPLATE;

		
		// getting template for outer file

		Template template = new Template(strTemplate);

		Map<String,String> map = new LinkedHashMap<String,String>();
		
		map.put("TABLENAME", strTableName);

		// getting replaced data of the outer template

		String strMsg = template.patch(map);

		// returning result 0

		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(outputFolderPath
					+ File.separatorChar + strOutputFileName));
			out.write(strMsg);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.print("Error : While generating DAO file + strOutputFileName");
			return false;
		}
		return true;
	}
	
	
	public boolean generateDAOImplFile(String strTableName) {
		String strOutputFileName = strTableName + "DAOImpl.java";
		if (checkFileExist(outputFolderPath, strOutputFileName)) {
			return true;
		}

		String strTemplate = "./template" + File.separatorChar
				+ CodeGeneratorConstant.DAO_IMPL_TEMPLATE;

		
		// getting template for outer file

		Template template = new Template(strTemplate);

		Map<String,String> map = new LinkedHashMap<String,String>();
		
		map.put("TABLENAME", strTableName);
		
		String daoName = CodeGeneratorUtil.getVariableName(strTableName);
		map.put("daoNAME", daoName);

		// getting replaced data of the outer template

		String strMsg = template.patch(map);

		// returning result 0

		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(outputFolderPath
					+ File.separatorChar + strOutputFileName));
			out.write(strMsg);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.print("Error : While generating DAO file + strOutputFileName");
			return false;
		}
		return true;
	}

	
	
	public boolean generateServiceFile(String strTableName) {
		String strOutputFileName = strTableName + "Service.java";
		if (checkFileExist(outputFolderPath, strOutputFileName)) {
			return true;
		}

		String strTemplate = "./template" + File.separatorChar
				+ CodeGeneratorConstant.DAO_IMPL_TEMPLATE;

		
		// getting template for outer file

		Template template = new Template(strTemplate);

		Map<String,String> map = new LinkedHashMap<String,String>();
		
		map.put("TABLENAME", strTableName);
		
		String daoName = CodeGeneratorUtil.getVariableName(strTableName);
		map.put("daoNAME", daoName);

		// getting replaced data of the outer template

		String strMsg = template.patch(map);

		// returning result 0

		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(outputFolderPath
					+ File.separatorChar + strOutputFileName));
			out.write(strMsg);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.print("Error : While generating DAO file + strOutputFileName");
			return false;
		}
		return true;
	}
	

	/**
	 * Check File Exists in the given Path
	 * 
	 * @date 2007/02/15
	 * @param strPath
	 * @param strFileName
	 * @return
	 */
	public boolean checkFileExist(String strPath, String strFileName) {
		File fName = new File(strPath + File.separator + strFileName);
		return fName.exists();
	}

	public List<String> getEntityClassName(String path) {
		BufferedReader br = null;
		List<String> classList = new ArrayList<String>();
		try {
			br = new BufferedReader(new FileReader(path));
			String line;
			
			while ((line = br.readLine()) != null) {
				// process the line.
				classList.add(line);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return classList;
	}

	public boolean generateIDAOImpl(String path) {
	List<String> daoClassList = getEntityClassName(path);
		
		for (Iterator<String> iterator = daoClassList.iterator(); iterator.hasNext();) {
			String className = iterator.next();
			if(className.indexOf("PK")!=-1) continue;
			generateDAOImplFile(className);
		}
		return true;
		
	}

}
