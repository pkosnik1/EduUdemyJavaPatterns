package com.pkosnik.patterns.factory;

public class Male implements Person {

	@Override
	public void wish(String msg) {
		System.out.println("Male wish is " + msg);


	}

}