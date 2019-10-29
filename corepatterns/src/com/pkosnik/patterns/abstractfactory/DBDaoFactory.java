package com.pkosnik.patterns.abstractfactory;

public class DBDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDeo(String type) {
		Dao d = null;
		if (type.equals("emp")) {
			d = new DBEmpDao();
		} else if (type.equals("dep")) {
			d = new DBDepDao();
		}
		return d;
	}

}
