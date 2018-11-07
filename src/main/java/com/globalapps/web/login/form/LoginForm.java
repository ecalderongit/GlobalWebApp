package com.globalapps.web.login.form;

import org.apache.struts.action.ActionForm; 

public class LoginForm extends ActionForm {
	
	private String email = null;
	private int securityCode;
	
	public LoginForm(){
		super();
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}
}
