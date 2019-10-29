package com.pkosnik.patterns.factory;

public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = PersonFactory.createPerson("male");
		Person p2 = PersonFactory.createPerson("female");
		p1.wish("big dick");
		p2.wish("big tits");

	}

}
