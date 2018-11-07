package com.globalapps.common.exception;

public class NotificationException extends BaseException {
	
	public static String EXCEPTION_CODE = "not";
	public static String SEND_MAIL_EXCEPTION = "01";
	public static String DEFAULT_ERROR = "00";
	public NotificationException(String errorCode){
		this.setCode(errorCode);
	}
	public NotificationException(){
		this.setCode(DEFAULT_ERROR);
	}

}
