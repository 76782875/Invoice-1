package com.util;

public class StringUtils {
	
	/**
	 * ���ַ����ж�
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		
		return str.length()==0;
	}
	/**
	 * �հ��ַ����ж�
	 */
	public static boolean isBlank(String str){
		return str.trim().length()==0;
	}
	/**
	 * �����ж�
	 * @param str
	 * @return
	 */
	public static boolean isNumber(String str){
		return null!=str && str.matches("[\\d]+(\\.[\\d]+)?");
	}
	
	/**
	 * ��ĸ�ж�
	 * @param args
	 */
	public static boolean isLetter(String str){
		return null!=str && str.matches("[a-zA-Z]+");
	}
	
	/**
	 * �����ʽ�ж�
	 * @param args
	 */
	public static boolean isEmail(String str){
		return null!=str && str.matches("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$");
	}
	/**
	 * ���ڸ�ʽ�ж�
	 */
	public static boolean isDate(String str){
		return null!=str && str.matches("[\\d]{4}\\/(([0][1-9])|([1][0-2]))\\/(([0][1-9])|([1|2][0-9])|[3][0|1])");
	}
}
