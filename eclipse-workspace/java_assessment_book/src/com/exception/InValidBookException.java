package com.exception;

public class InValidBookException extends RuntimeException {

	private String message;

	public InValidBookException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
