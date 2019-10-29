package com.pkosnik.patterns.factory;

public class ChickenPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing chicke pizza");

	}

	@Override
	public void bake() {
		System.out.println("Baking chicke pizza");
	}

	@Override
	public void cut() {
		System.out.println("Cutting chicke pizza");
	}

}
