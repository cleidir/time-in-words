package com.bravi.time.in.words.exceptions;

public class InvalidMinuteException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public InvalidMinuteException(String message) {
		super(message);
	}
}