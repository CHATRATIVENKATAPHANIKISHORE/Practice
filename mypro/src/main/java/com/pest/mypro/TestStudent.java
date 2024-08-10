package com.pest.mypro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ApplicationContext contexttwo = new ClassPathXmlApplicationContext("cg.xml");
		 * Student ps = contexttwo.getBean(Student.class); ps.setName("Hb");
		 * ps.setSid(1);
		 */
		ApplicationContext context
        = new AnnotationConfigApplicationContext(
            MyConfig.class);
        Student s=(Student)context.getBean(Student.class);
        System.out.println(s);
        

	}

}
