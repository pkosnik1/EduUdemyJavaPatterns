package com.pkosnik.patterns.abstractfactory;

public class Test {

	public static void main(String[] args) {
		DaoAbstractFactory dap = null;
		Dao d = null;
		dap = DaoFactoryProducer.produce("xml");
		d = dap.createDeo("emp");
		d.save();
		d = dap.createDeo("dep");
		d.save();

		dap = DaoFactoryProducer.produce("db");
		d = dap.createDeo("emp");
		d.save();
		d = dap.createDeo("dep");
		d.save();
	}

}
