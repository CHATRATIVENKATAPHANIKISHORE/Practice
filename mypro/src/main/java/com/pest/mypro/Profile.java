package com.pest.mypro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	 @Autowired
	   @Qualifier("phonepay")
	   private PayWay pays;

	   public Profile(){
	      System.out.println("Inside Profile constructor." );
	   }
	   public void makepay() {
	      System.out.println(pays.getName() );
	   }
	  
}
