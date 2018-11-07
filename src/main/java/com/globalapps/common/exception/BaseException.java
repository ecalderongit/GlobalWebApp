package com.globalapps.common.exception;

public class BaseException extends Exception {
	
	private String code = null;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
