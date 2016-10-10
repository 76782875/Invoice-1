package com.exception;

public class BusinessException extends Exception{
	
	private static final long serialVersionUID = 1L;
	/**
	 * ��������
	 */
	private String pageName;
	/**
	 * ������Ϣ
	 */
	private String errorMsg;
	/**
	 * ���ݶ���
	 */
	private Object object;
	/**
	 * ҳ�������
	 */
	private String objStr;
	
	public BusinessException(String pageName, String errorMsg, Object object,
			String objStr) {
		this.pageName = pageName;
		this.errorMsg = errorMsg;
		this.object = object;
		this.objStr = objStr;
	}
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	public String getObjStr() {
		return objStr;
	}
	public void setObjStr(String objStr) {
		this.objStr = objStr;
	}
	
}
