package com.globallogic.exception;

public class InvalidWeightException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String message;

	public InvalidWeightException() {
		super();
	}

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
