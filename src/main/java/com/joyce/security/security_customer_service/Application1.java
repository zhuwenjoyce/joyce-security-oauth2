package com.joyce.security.security_customer_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Refer URL: https://www.baeldung.com/spring-security-5-oauth2-login
 */
@SpringBootApplication
@EnableConfigurationProperties
public class Application1 {

	public static void main(String[] args) {
		SpringApplication.run(Application1.class, args);
	}

}
