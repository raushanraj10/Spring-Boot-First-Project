package com.example.SpringBootFirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

import javax.sql.DataSource;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringBootFirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstProjectApplication.class, args);
			System.out.println("hi");
		}

};
