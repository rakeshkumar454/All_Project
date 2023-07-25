package com.globallogic.exception;

public class NullPointerExcpetion extends RuntimeException{
	String msg;

	public NullPointerExcpetion(String msg) {
		super();
		this.msg = msg;
	}
	public String getMessage() {
		return msg;
	}

}
