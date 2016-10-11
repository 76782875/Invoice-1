package com.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.constant.Constants;
import com.exception.SystemException;

public class DateUtils {
	/**
	 * �ַ���ת��ΪDate
	 * @param str
	 * @return
	 * @throws SystemException
	 */
	public static Date StringParseToDate(String str) throws SystemException{
		
		SimpleDateFormat sf = new SimpleDateFormat(Constants.FORMAT_OF_DATE);
		
		try {
			return sf.parse(str);
		} catch (ParseException e) {
			throw new SystemException("ϵͳ�쳣������ϵ����Ա��");
		}
	}
	/**
	 * Dateת��Ϊ�ַ���
	 */
	public static String dateParseToString(Date date){
		SimpleDateFormat sf = new SimpleDateFormat(Constants.FORMAT_OF_DATE);
		return sf.format(date);
	}
	/**
	 * util.Dateת��Ϊsql.Date
	 */
	public static java.sql.Date utilParseToSql(Date date){
		return new java.sql.Date(date.getTime());
	}
	/**
	 * sql.Dateת��Ϊutil.Date
	 */
	public static java.sql.Date sqlParseToUtil(java.sql.Date date){
		
		return new java.sql.Date(date.getTime());
	}
}
