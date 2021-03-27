package com.yuelchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import com.yuelchen.service.UserService;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)  
public class SpringBootAopDemoApplication {

	/* Once you run-as Spring Boot application, you can view the following:
	 * 
	 * @Around - see console log.
	 * Trigger: Start application
	 * 
	 * @Before @After - see console log.
	 * Trigger: http://localhost:8080/user/add?first=John&last=Doe
	 * Trigger: http://localhost:8080/user/add?first=John&last=Doe&clearance=3
	 * 
	 * @Around @AfterReturning @AfterThrowing - see service method invocation below.
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootAopDemoApplication.class, args);
		
		UserService service = context.getBean(UserService.class);
		service.displayRegionOffice("us-east-1"); 	// around advice
		service.displayRegionOffice();				// after returning advice
		
		try {
			service.validPay(100000.00);			// does not trigger exception - after throwing advice
			service.validPay(200000.00);			// does trigger exception - after throwing advice
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}