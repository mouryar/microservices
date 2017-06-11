package com.learning.microservice.model;


public class ExceptionInfo {
	
	private String message;
	private int eventId;
	
	public ExceptionInfo(String message, int eventId) {
		super();
		this.message = message;
		this.eventId = eventId;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	@Override
	public String toString() {
		return "ExceptionInfo [message=" + message + ", eventId=" + eventId + "]";
	}
	
	
}
