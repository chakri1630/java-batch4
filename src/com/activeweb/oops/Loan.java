package com.activeweb.oops;

public class Loan implements Comparable<Loan> {

	String name;
	String make;
	String model;
	Integer loanAmount;
	String social;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loan other = (Loan) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		}
		return true;
	}

	@Override
	public int compareTo(Loan o) {
		return o.make.compareTo(make);
	}

}
