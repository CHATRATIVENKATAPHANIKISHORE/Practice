package com.pest.mypro;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PayController {

	 void makepay(@Qualifier("paytm") PaymentInterface ps) {
		ps.pay();
	}
	public static void main(String[] args) {
		PaymentInterface p = new PaytmApp();
		makepay(p);
		PaymentInterface p2 = new PaytmApp();
		makepay(p);
		
		
		
	}
}
