package com.med.kirana.utility;

public class NotificationMessage {

	public static final String SUCCESS="success";
	public static final String ERROR="danger";
	
	private String message;
	private String type;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
