package com.pkosnik.patterns.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestLoger {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		HomeLoger hl1 = HomeLoger.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(new File("C:\\Users\\User\\WorkspaceUdemy\\JDP\\_repo\\HomeLoger.ser")));
		oos.writeObject(hl1);

		HomeLoger hl2 = HomeLoger.getInstance();
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(new File("C:\\Users\\User\\WorkspaceUdemy\\JDP\\_repo\\HomeLoger.ser")));
		hl2 = (HomeLoger) ois.readObject();
		oos.close();
		ois.close();

		System.out.println(hl1 == hl2);

		hl1.setMessage("test1");
		hl2.setMessage("test2");
		System.out.println(hl1.getMessage());

	}

}
