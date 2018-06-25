package com.activeweb.app.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AutoLoanService<T> {

	public void processOrder(String filePath) {

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(filePath);

			br = new BufferedReader(fr);

			String line = null;

			while ((line = br.readLine()) != null) {
				System.out.println("line read" + line);
			}

			int ch;

			while ((ch = fr.read()) != -1) {
				char c = (char) ch;
				System.out.println("character.." + c);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void main(String args[]) {

		AutoLoanService<String> als = new AutoLoanService<>();

		try {

			als.processOrder("C:\\Work\\Files\\orderdata.txt");
			als.updateOrderStatus();

		} catch (Exception e) {
			System.out.println("" + e.getMessage());
		}

	}

	public void updateOrderStatus() {

		long startTime = System.nanoTime();

		try (FileWriter fw = new FileWriter("C:\\Work\\Files\\updateStatus.txt");
			 FileReader fr = new FileReader("C:\\\\Work\\\\Files\\\\updateStatus.txt")	) {

			fw.write(
					"DelivereDeliveredDeliveredDeliveredDeliveredDeliveredDeliveredDeliveredDeliveredDeliveredDeliveredDeliveredd");

		} catch (IOException ie) {
			System.out.println("" + ie.getMessage());
		}

		long endTime = System.nanoTime();

		System.out.println("time taken..." + (endTime - startTime));

	}

}
