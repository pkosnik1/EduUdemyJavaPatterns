package com.pkosnik.patterns.flyweight;

public class Rectangle extends Shape {
	private String lable;

	public Rectangle() {
		this.lable = "Rectangle";
	}

	@Override
	public void draw(int lenght, int breadth, String fillStyle) {
		System.out.println("Drawing a " + lable + " with breadt " + breadth + " with langth " + lenght
				+ " with fillStyle " + fillStyle);

	}

}
