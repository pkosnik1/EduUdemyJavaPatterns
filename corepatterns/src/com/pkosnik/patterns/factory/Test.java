package com.pkosnik.patterns.factory;

public class Test {
	public static void main(String[] args) {
		PizzaStore ps = new PizzaStore();
		ps.orderPizza("chicken");
		ps.orderPizza("cheese");
		ps.orderPizza("veggie");
	}
}
