package com.globallogic.wrestler.exception;

public class InvalidWeightException extends RuntimeException {
	
	private String message;

	public InvalidWeightException(String message) {
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
