package com.exception;

public class ParameterException extends Exception {

	private static final long serialVersionUID = 1L;
	/**
	 * 页面名称
	 */
	private String pageName;
	/**
	 * 页面元素ID
	 */
	private String elementId;
	/**
	 * 出错信息
	 */
	private String errorMsg;
	/**
	 * Object1
	 */
	private Object object;
	/**
	 * Object1  str
	 */
	private String objStr;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getElementId() {
		return elementId;
	}

	public void setElementId(String elementId) {
		this.elementId = elementId;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public ParameterException() {
		super();
	}

	public ParameterException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public ParameterException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ParameterException(String arg0) {
		super(arg0);
	}

	public ParameterException(Throwable arg0) {
		super(arg0);
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

	public ParameterException(String pageName, String elementId,
			String errorMsg, Object object, String objStr) {
		this.pageName = pageName;
		this.elementId = elementId;
		this.errorMsg = errorMsg;
		this.object = object;
		this.objStr = objStr;
	}
	
}
