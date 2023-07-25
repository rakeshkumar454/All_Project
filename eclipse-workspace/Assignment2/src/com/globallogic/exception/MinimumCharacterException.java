package com.globallogic.exception;

public class MinimumCharacterException extends RuntimeException{
	String msg;

	public MinimumCharacterException(String msg) {
		super();
		this.msg = msg;
	}
	public String getMessage() {
		return msg;
	}

}
