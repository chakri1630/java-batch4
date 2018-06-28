package com.activeweb.app.oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Customer {

	String companyName = "ActiveAutoLoans";

	List<Car> cars = null;

	public static void main(String args[]) {

		Customer customer = new Customer();

		customer.applyLoan(args[0], Integer.parseInt(args[1]), args[2]);

		System.out.println("Absolute value of input is ...." + Math.abs(10.01));

		System.gc();

		Customer c = new Customer();

		Customer.InnerClass ic = new Customer().new InnerClass();

	}

	public final Integer applyLoan(String name, Integer seedAmount, String social) {

		Integer loanAmount;

		if (seedAmount > 1000) {
			loanAmount = 20000;
		} else if (seedAmount > 2000) {
			loanAmount = 3000;
		} else {
			loanAmount = 15000;
		}

		// TODO : logic to interact with database using JDBC and store the Name and
		// Social along with Amount

		return loanAmount;

	}

	public List<Car> issueLoan(Loan loan) {

		StringBuilder sb = new StringBuilder();

		sb.append("Mr");
		sb.append(". ");
		sb.append(loan.name);

		Decider decider = new Decider();
		Integer sanctionedAmount = decider.decisionMaker(loan.social);

		Integer downPayment = loan.loanAmount - sanctionedAmount;

		Car car = new Car();
		car.setDownPayment(downPayment);
		car.setStatus(true);

		cars = new ArrayList<Car>();

		Collections.unmodifiableList(cars);

		return cars;

	}

	public Integer issueLoanV2(String name, String social, String make, String model, Integer loanAmount) {

		Decider decider = new Decider();
		Integer sanctionedAmount = decider.decisionMaker(social);

		Integer downPayment = loanAmount - sanctionedAmount;

		return downPayment;

	}

	public class InnerClass {

	}

}
