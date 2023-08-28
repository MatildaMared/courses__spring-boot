package com.matildamared.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// with scanBasePackages, we can specify the packages to scan for components, default is the current package
@SpringBootApplication(scanBasePackages = {
		"com.matildamared.springcoredemo",
		"com.matildamared.util"})
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
