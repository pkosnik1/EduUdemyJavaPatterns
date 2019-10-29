package com.pkosnik.patterns.templatemethod;

public class TestComputer {

	public static void main(String[] args) {
		ComputerManfacturer cm = null;
		cm = new LaptopManfacturer();
		cm.buildComputer();
		cm = new DesktopManfacturer();
		cm.buildComputer();
		

	}

}
