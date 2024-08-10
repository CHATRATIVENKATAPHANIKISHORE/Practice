package com.pest.mypro;

import org.springframework.stereotype.Component;

@Component("phonepay")

public class PhonepayApp implements PaymentInterface {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Phonepay - paid");

	}

}
