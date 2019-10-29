package com.pkosnik.patterns.abstractfactory;

public class DaoFactoryProducer {
	public static DaoAbstractFactory produce(String factoryType) {
		DaoAbstractFactory daf = null;
		if (factoryType.equals("db")) {
			daf = new DBDaoFactory();
		} else if (factoryType.equals("xml")) {
			daf = new XMLDaoFactory();
		}
		return daf;
	}

}
