package com.globalapps.web.common.bean;

import com.globalapps.security.Credential;

public class AppSession {
	private Credential credential;
	private long lastResquetTime;

	public Credential getCredential() {
		return credential;
	}

	public void setCredential(Credential credential) {
		this.credential = credential;
	}

	public long getLastResquetTime() {
		return lastResquetTime;
	}

	public void setLastResquetTime(long lastResquetTime) {
		this.lastResquetTime = lastResquetTime;
	}
	
}
