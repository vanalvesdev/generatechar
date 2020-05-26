package com.vaanalvesr.generatechar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@ComponentScan
public class GeneratecharApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeneratecharApplication.class, args);
	}

}
