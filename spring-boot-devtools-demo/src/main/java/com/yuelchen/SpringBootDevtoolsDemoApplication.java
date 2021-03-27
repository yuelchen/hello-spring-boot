package com.yuelchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDevtoolsDemoApplication {

	/* To see how changes take effect:
	 * 1. Run project as Spring Boot Application (starts the application). 
	 * 2. Open (localhost:8080) application in browser. 
	 * 3. Navigate to either src/main/resources/templates/index.html to make change or
	 *    src/main/java/com/yuelchen/controller/GreetingController.java.
	 * 4. Save the changes and you should see in console, the application restarting.
	 * 5. Refresh your browser page to view the application update (localhost:8080). 
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDevtoolsDemoApplication.class, args);
	}
}