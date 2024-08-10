package com.pest.mypro;

import org.springframework.context.ApplicationContextInitializer;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.context.*; //I can import this
import org.springframework.context.ApplicationContext; //But I can't import this
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Myconfig.xml");
        Employee e = (Employee)context.getBean("emp");
        e.setEmpId("1");
        e.setEmpName("e");
        System.out.println(e);
        Order o = (Order)context.getBean("ord");
        o.setOrderId("1");
        o.setCurrentDate(LocalDate.now().toString());
        o.setOrderDate(LocalDate.now().toString());
        List<String> bd = new ArrayList<>();
        bd.add("oil");
        bd.add("cream");
        
       o.setProducts(bd);
        System.out.println(o);
        Product p = (Product)context.getBean("prods");
        System.out.println(p);
        
        
        
    }
}
