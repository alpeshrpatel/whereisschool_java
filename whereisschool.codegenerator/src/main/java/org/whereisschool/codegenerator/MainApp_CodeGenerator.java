package org.whereisschool.codegenerator;

/**
 * Hello world!
 *
 */
public class MainApp_CodeGenerator 
{
    public static void main( String[] args )
    {
        CodeGenerator codeGenerator = new CodeGenerator("./output/");
        
        String path = "./template/dao_classlist.txt";
        
        //codeGenerator.generateDAO(path);
        codeGenerator.generateIDAOImpl(path);
    }
}
