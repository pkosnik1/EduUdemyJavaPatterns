package com.pkosnik.patterns.templatemethod;

public class LaptopManfacturer extends ComputerManfacturer {

	@Override
	protected void addHardDisk() {
		System.out.println("Laptop disk added");
	}

	@Override
	protected void addRam() {
		System.out.println("Laptop Ram added");
	}

	@Override
	protected void addKeyboard() {
		System.out.println("Laptop Keyboard added");
	}

}
