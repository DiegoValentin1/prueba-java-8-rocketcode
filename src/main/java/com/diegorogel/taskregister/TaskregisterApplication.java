package com.diegorogel.taskregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class TaskregisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskregisterApplication.class, args);
	}

}
