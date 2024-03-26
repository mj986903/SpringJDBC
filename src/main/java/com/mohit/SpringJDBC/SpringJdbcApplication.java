package com.mohit.SpringJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mohit.SpringJDBC.model.Alien;
import com.mohit.SpringJDBC.repo.AlienRepo;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);
		
		Alien a = context.getBean(Alien.class);
		a.setId(39);
		a.setName("MOHIT");
		a.setTech("JAVA");
		
		// JDBC Steps
		
		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(a);
		System.out.println(repo.findAll());
	}

}
