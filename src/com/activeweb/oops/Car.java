package com.activeweb.oops;

import java.io.Serializable;

public class Car extends Auto implements Serializable {

	private static final long serialVersionUID = 7940418933773742074L;

	private Integer downPayment;
	private boolean status;
	private transient String password;

	public Integer getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(Integer downPayment) {
		this.downPayment = downPayment;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Integer[] sort(Integer[] ints) {
		return null;
	}

	public String toString() {

		return downPayment.toString() + status + password;

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
