package com.globalapps.security;

public class Credential {
	private int id;
	private int passCode;
	private String email;
	private long passCodeGenerationTime;
	private int retryAccount = 0;
	private String status = "I";
	private String name;
	private byte[] avatar;
	private boolean isValid;
	
	public long getPassCodeGenerationTime() {
		return passCodeGenerationTime;
	}
	public void setPassCodeGenerationTime(long passCodeGenerationTime) {
		this.passCodeGenerationTime = passCodeGenerationTime;
	}
	public Credential(){
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassCode() {
		return passCode;
	}
	public String getPassCodeAsString() {
		return Integer.toString(passCode);
	}
	public void setPassCode(int passCode) {
		this.passCode = passCode;
	}

	public int getRetryAccount() {
		return retryAccount;
	}
	public void setRetryAccount(int retryAccount) {
		this.retryAccount = retryAccount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public byte[] getAvatar() {
		return avatar;
	}
	public void setAvatar(byte[] avatar) {
		this.avatar = avatar;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	
}
