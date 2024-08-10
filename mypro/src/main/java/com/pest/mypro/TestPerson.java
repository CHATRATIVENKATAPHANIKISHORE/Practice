package com.pest.mypro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");

Person e = (Person)context.getBean("per");
Address a = new Address("hi","ghv");
e.setId(1);
e.setAdd(a);

  Human b = (Human)context.getBean("hum");
  b.setName("Hi");
  
  System.out.println(b);
  
  
 
/*
 * ApplicationContext contexttwi = new AnnotationConfigApplicationContext(
 * MyHuman.class); Human sb=(Human)contexttwi.getBean(Human.class);
 * System.out.println(sb); System.out.println(e);
 */


       
      
       

	}

}
