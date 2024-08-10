package com.pest.mypro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages="com.pest.mypro.*")
public class MyConfig {
	@Bean
	public Student  getStudent()
	{
		return new Student(1,"hi");
	}

	

}
