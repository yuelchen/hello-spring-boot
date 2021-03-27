package com.yuelchen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.yuelchen.model.User;
import com.yuelchen.repo.UserRepository;

@SpringBootApplication
public class SpringBootDataJpaDemoApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringBootDataJpaDemoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaDemoApplication.class, args);
	}

	/* This can also be done manuall after from the browser when you've logged into h2-console.
	 * 
	 * We are simply using CommandLineRunner to execute some commands to load default data.
	 */
	@Bean
	public CommandLineRunner run(UserRepository userRepository) {
		return (args) -> {
			// add Users (notice how all usernames are unique)
			userRepository.save(new User("tbone123", "Taylor", "Lee"));
			userRepository.save(new User("cheekysammy", "Samantha", "white"));
			userRepository.save(new User("afunky", "Andrew", "Fung"));
			userRepository.save(new User("mafia4life", "Sergio", "Dicaprio"));
			userRepository.save(new User("bballwin", "Bob", "Sanchez"));
			
			// fetch and print all users
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (User user : userRepository.findAll()) {
				log.info(user.toString());
			}
			log.info("");

			// fetch user based off last name
			log.info("Customer found with findByLastName('Fung'):");
			log.info("--------------------------------------------");
			userRepository.findByLastName("Fung").forEach(user -> {
				log.info(user.toString());
			});
			log.info("");
			
			// fetch user based off last name
			log.info("Customer found with findByFirstName('Bob'):");
			log.info("--------------------------------------------");
			userRepository.findByFirstName("Bob").forEach(user -> {
				log.info(user.toString());
			});
			log.info("");
		};
	}
}