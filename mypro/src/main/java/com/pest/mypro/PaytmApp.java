package com.pest.mypro;

import org.springframework.stereotype.Component;

@Component("paytm")
public class PaytmApp implements PaymentInterface {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("paytm - paid");

	}

}
