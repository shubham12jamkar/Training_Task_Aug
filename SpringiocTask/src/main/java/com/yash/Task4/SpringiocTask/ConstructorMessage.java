package com.yash.Task4.SpringiocTask;

public class ConstructorMessage {
	private String message;

	public ConstructorMessage(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "ConstructorMessage [message=" + message + "]";
	}
	

}
