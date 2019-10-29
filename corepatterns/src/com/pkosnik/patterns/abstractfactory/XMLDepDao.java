package com.pkosnik.patterns.abstractfactory;

public class XMLDepDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving Department to XML");
	}

}
