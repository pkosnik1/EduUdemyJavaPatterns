package com.pkosnik.patterns.adapter;

public class WeatherAdapteer {
	public int findTemerature(int zipcode) {
		String city = null;
		if (zipcode==19406) {
			city = "King Of Prussia";
		}
		
		WeatherFinderImpl finder= new WeatherFinderImpl();
		int temperature = finder.find(city);
		return temperature;
	}

}
