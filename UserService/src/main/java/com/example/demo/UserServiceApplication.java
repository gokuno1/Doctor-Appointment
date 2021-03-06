package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableJdbcHttpSession
@EnableJpaRepositories
public class UserServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
