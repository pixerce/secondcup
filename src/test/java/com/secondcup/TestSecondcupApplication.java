package com.secondcup;

import org.springframework.boot.SpringApplication;

public class TestSecondcupApplication {

	public static void main(String[] args) {
		SpringApplication.from(SecondcupApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
