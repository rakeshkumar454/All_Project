package com.globallogic.wrestler.exception;

public class InvalidNameException extends RuntimeException {
	
	private String message;

	public InvalidNameException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
