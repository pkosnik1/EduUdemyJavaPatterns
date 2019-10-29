package com.pkosnik.patterns.adapter;

public class PaymentAdapter {
	public void pay(int peleny) {
		int dollars;
		dollars = peleny * 2;
		PaymentProcessorImpl processor = new PaymentProcessorImpl();
		processor.pay(dollars);
	}

}
