package com.activeweb.app.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.activeweb.oops.Car;

public class PersistCar {

	public void createAndSerializeCar() {

		Car c = new Car();

		c.setDownPayment(1000);
		c.setStatus(true);
		c.setPassword("password1");

		FileOutputStream fos = null;
		ObjectOutputStream os = null;

		try {

			fos = new FileOutputStream("C:\\Work\\Files\\car.ser");
			os = new ObjectOutputStream(fos);

			os.writeObject(c);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String args[]) {
		PersistCar pc = new PersistCar();
		pc.deserializeCar();
	}

	public void deserializeCar() {

		try (FileInputStream fis = new FileInputStream("C:\\Work\\Files\\car.ser");
				ObjectInputStream ois = new ObjectInputStream(fis)) {

			Car desCar = (Car) ois.readObject();

			System.out.println("" + desCar);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
