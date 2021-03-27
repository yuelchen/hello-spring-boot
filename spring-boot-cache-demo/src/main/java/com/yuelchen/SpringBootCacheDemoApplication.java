package com.yuelchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication @EnableCaching
public class SpringBootCacheDemoApplication {

	/* Use the below URL to simulate user request and clear:
	 * http://localhost:8080/users 			-	Returns a default list of users and store in cache.
	 * http://localhost:8080/users/clear	- 	Clears the default list of users from cache. 
	 * 
	 * See console logs for output time in nanoseconds
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCacheDemoApplication.class, args);
	}
}