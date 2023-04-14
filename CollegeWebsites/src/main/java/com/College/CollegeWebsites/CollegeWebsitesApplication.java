package com.College.CollegeWebsites;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.DriverManager;

@SpringBootApplication
public class CollegeWebsitesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeWebsitesApplication.class, args);
		DriverManager con;
	}

}
