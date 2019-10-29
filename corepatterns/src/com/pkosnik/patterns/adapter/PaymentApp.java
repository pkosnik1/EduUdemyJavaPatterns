package com.pkosnik.patterns.adapter;

public class PaymentApp {
	public void pay(int peleny) {
	PaymentAdapter adapter = new PaymentAdapter();
	adapter.pay(peleny);
	}
}
