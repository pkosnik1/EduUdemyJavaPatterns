package com.pkosnik.patterns.templatemethod;

public abstract class ComputerManfacturer {
	public void buildComputer() {
		addHardDisk();
		addRam();
		addKeyboard();
	}

	protected abstract void addHardDisk();

	protected abstract void addRam();

	protected abstract void addKeyboard();

}
