package com.pkosnik.patterns.decorator;

public class PizzaShop {

	public static void main(String[] args) {
		Pizza pizza1 = new CheesePizzaDecorator(new PlainPizza());
		pizza1.bake();
		Pizza pizza2 = new VeggiePizzaDecorator(new PlainPizza());
		pizza2.bake();
		Pizza pizza3 = new CheesePizzaDecorator(new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza())));
		pizza3.bake();

	}

}
