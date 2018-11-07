package com.globalapps.security;



import com.globalapps.web.common.config.CommonConfigBean;


public class SecureCode {
	public static int create(){
		String code = "" + (int)(100000000 * Math.random());
		return  Integer.valueOf(code.substring(0, Integer.valueOf(CommonConfigBean.getInstance().getParam("securityCodeLength"))));
	}
	
}
