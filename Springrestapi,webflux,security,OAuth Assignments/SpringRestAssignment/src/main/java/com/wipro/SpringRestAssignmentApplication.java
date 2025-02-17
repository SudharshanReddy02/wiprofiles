package com.wipro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.Entity.Cricket;

@SpringBootApplication
public class SpringRestAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestAssignmentApplication.class, args);
		
		//Cricket cric=new Cricket(310,"India","NZ","2028-07-6","Rajashekar Reddy Stadium",567000.0);
	}

}
