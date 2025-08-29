package com.async_demo.async_demo_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AsyncDemoAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(AsyncDemoAppApplication.class, args);
	}

}
