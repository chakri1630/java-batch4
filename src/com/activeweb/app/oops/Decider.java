package com.activeweb.app.oops;

public class Decider {

	public Integer decisionMaker(String social) {

		if (Integer.parseInt(social) > 700) {
			return 20000;
		} else {
			return 10000;
		}
	}

}
