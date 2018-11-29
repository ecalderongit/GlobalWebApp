package com.globalapps.notification;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MailMessage {
	private String subject;
	private Collection<String> receivers;
	private Collection<String> cc;
	private Collection<String> hcc;
	private Map<String, String> params;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Collection<String> getReceivers() {
		return receivers;
	}
	public void setReceivers(Collection<String> receivers) {
		this.receivers = receivers;
	}
	public void addReceiver(String receiver) {
		if(null == receivers){
			receivers = new ArrayList<>();	
		}
		receivers.add(receiver);
	}
	public Collection<String> getCc() {
		return cc;
	}
	public void setCc(Collection<String> cc) {
		this.cc = cc;
	}
	public Collection<String> getHcc() {
		return hcc;
	}
	public void setHcc(Collection<String> hcc) {
		this.hcc = hcc;
	}
	public Map<String, String> getParams() {
		return params;
	}
	public void setParams(Map<String, String> params) {
		this.params = params;
	}
	public void addParam(String name, String value) {
		if(null == params){
			params = new HashMap<>();	
		}
		params.put(name, value);
	}
	
}
