package com.pkosnik.patterns.singleton;

import java.io.Serializable;

public class HomeLoger implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static volatile HomeLoger instance;
	private String message = null;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private HomeLoger() {

	}

	public static HomeLoger getInstance() {
		if (instance == null) {
			synchronized (HomeLoger.class) {
				if (instance == null) {
					instance = new HomeLoger();
				}
			}
		}
		return instance;
	}
	
	protected Object readResolve() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
