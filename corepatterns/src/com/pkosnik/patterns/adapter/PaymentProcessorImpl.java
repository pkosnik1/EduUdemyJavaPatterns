package com.pkosnik.patterns.adapter;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public void pay(int dollars) {
		System.out.println("payment has been made: " + dollars);

	}

}
