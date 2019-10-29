package com.pkosnik.patterns.flyweight;

public class Circle extends Shape {
	private String lable;

	public Circle() {
		this.lable = "Circle";
	}

	@Override
	public void draw(int radius, String fillColor, String lineColor) {
		System.out.println("Drawing a " + lable + " with radious " + radius + " Fill color " + fillColor
				+ " Line color " + lineColor);

	}

}
