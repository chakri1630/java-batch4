package com.activeweb.oops;

import java.util.Iterator;
import java.util.List;

public class UIHandler {

	public Car checkLoanEligibity(String name, String social, String make, String model, Integer loanAmount) {

		Customer c = new Customer();

		Loan loan = new Loan();
		loan.loanAmount = loanAmount;
		loan.name = name;

		List<Car> dbCars = c.issueLoan(loan);

		Iterator<Car> itr = dbCars.iterator();

		while (itr.hasNext()) {
			itr.remove();
		}

		return null;
	}

}
