package com.pkosnik.patterns.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerImpl implements Customer {

	private CreditCard creditCard;

	@Autowired
	CustomerImpl(CreditCard creaditCard) {
		this.creditCard = creaditCard;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	@Override
	public void pay() {
		getCreditCard().makePayment();
	}

}
