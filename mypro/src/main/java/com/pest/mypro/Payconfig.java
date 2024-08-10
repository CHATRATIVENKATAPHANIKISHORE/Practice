package com.pest.mypro;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Payconfig {
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("myprofile.xml");

	      Profile profile = (Profile) context.getBean("profile");
	      
	      profile.makepay();
	   }

}
