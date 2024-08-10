package com.pest.mypro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages="com.pest.mypro.*")
public class MyHuman {
	@Bean
	public Human  getHuman()
	{
		return new Human("hi");
	}

}
