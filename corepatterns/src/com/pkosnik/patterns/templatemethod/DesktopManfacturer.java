package com.pkosnik.patterns.templatemethod;

public class DesktopManfacturer extends ComputerManfacturer {

	@Override
	protected void addHardDisk() {
		System.out.println("Desktop disk added");
	}

	@Override
	protected void addRam() {
		System.out.println("Desktop Ram added");
	}

	@Override
	protected void addKeyboard() {
		System.out.println("Desktop Keyboard added");
	}

}
