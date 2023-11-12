package com.delaney.todoapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.delaney.todoapp.models.Role;
import com.delaney.todoapp.repositories.RoleRepository;

@SpringBootApplication
public class TodoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner seed(RoleRepository roleRepository) {
		return (args) -> {
			Role userRole = new Role();
			userRole.setName("USER");
			roleRepository.save(userRole);

			Role adminRole = new Role();
			adminRole.setName("ADMIN");
			roleRepository.save(adminRole);
		};
	}
  
}
