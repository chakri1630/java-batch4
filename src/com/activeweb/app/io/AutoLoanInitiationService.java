package com.activeweb.app.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.activeweb.oops.Auto;

public class AutoLoanInitiationService {

	public void intiation() {

		try (InputStream is = new FileInputStream("C:\\Users\\sairam\\Pictures\\jfc_1202.jpeg");
				OutputStream os = new FileOutputStream("C:\\Work\\Files\\abc.jpeg")) {

			int b;

			while ((b = is.read()) != -1) {
				os.write(b);
			}

		} catch (

		FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String args[]) {
		AutoLoanInitiationService alis = new AutoLoanInitiationService();
		alis.wildCard();
	}

	public void wildCard() {

		Auto<String> auto = new Auto<>();
		auto.doSomething();
	}

}
