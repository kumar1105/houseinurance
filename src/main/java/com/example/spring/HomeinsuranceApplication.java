package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")

@EnableJpaRepositories(basePackageClasses = com.example.repo.Insurancerepo.class)
@EntityScan("com.example.*")
public class HomeinsuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeinsuranceApplication.class, args);
	}

}
