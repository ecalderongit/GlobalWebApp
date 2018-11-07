package com.globalapps.common.exception;

public class AuthenticationException extends BaseException {
	
	public static String EXCEPTION_CODE = "lgn";
	public static String INVALID_ID_ERROR_CODE = "01";
	public static String USER_DOESNT_EXIST_ERROR_CODE = "02";
	public static String USER_IS_LOCKED = "05";
	public static String SECURITY_CODE_EXPIRED = "06";
	public static String DEFAULT_ERROR = "00";
	public static String AUTHENTICATION_ERROR = "00";
	public AuthenticationException(String errorCode){
		this.setCode(errorCode);
	}
	public AuthenticationException(){
		this.setCode(DEFAULT_ERROR);
	}
}
