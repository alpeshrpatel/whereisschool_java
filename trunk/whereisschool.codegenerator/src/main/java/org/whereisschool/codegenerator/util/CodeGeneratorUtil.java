package org.whereisschool.codegenerator.util;

public class CodeGeneratorUtil {
	/**
	 * @param strTableName
	 * @return
	 */
	public static String getVariableName(String strTableName) {
		String daoName= strTableName;
		 char c[] = daoName.toCharArray();
		 c[0] = Character.toLowerCase(c[0]);
		 daoName = new String( c );
		return daoName;
	}
}
