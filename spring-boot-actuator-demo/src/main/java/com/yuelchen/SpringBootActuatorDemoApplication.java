package com.yuelchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootActuatorDemoApplication {

	/* Run this project as a Spring Boot Application. 
	 * The server.port configuration by default will be 8080 - see application.properties under src/main/resources.
	 * 
	 * URL for actual application (see GreetingController):
	 * - http://localhost:8080/
	 * - http://localhost:8080/{name}
	 * 
	 * Actuator Endpoint:
	 * - http://localhost:8080/actuator
	 * 
	 * Actuator Endpoint for Health Check
	 * - http://localhost:8080/actuator/health
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootActuatorDemoApplication.class, args);
	}
}