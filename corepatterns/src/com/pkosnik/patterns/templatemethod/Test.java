package com.pkosnik.patterns.templatemethod;

public class Test {

	public static void main(String[] args) {
		DataRenderer renderer = null;
		renderer = new XMLDataRenderer();
		renderer.render();
		renderer = new CSVDataRenderer();
		renderer.render();
	}

}
