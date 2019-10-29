package com.pkosnik.patterns.adapter;

public class WeatherUI {
	public void showTemperature(int zipcode) {
		WeatherAdapteer adapteer = new WeatherAdapteer();
		System.out.println(adapteer.findTemerature(19406));
	}

}
