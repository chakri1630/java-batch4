package com.activeweb.oops;

import java.util.Comparator;

public class MakeComparator implements Comparator<Loan> {

	@Override
	public int compare(Loan o1, Loan o2) {
		// TODO Auto-generated method stub
		
		return (((Loan)o1).make).compareTo(((Loan)o2).make);
		
	}

}
