package com.mocktest.MockUnit;

import org.springframework.boot.SpringApplication;

public class TestMockUnitApplication {

	public static void main(String[] args) {
		SpringApplication.from(MockUnitApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
