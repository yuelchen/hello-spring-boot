# learn-spring-boot

## Spring Boot @Annotations
#### @SpringBootApplication
- You can think of this as like the main method - required for each Spring. 
- Combination of three other annotations (@EnableAutoConfiguration, @ComponentScan, and @Configuration)

#### @EnableAutoConfiguration (deprecated - will not be covered)
#### @ComponentScan
- We can use it to pass the base package we'd like to scan for Spring components (beans). 
- Used with the @Configuration annotation.

>@ComponentScan(basePackages = "com.yuelchen")  
@Configuration  
public class ScanBeans {  
  // code here...  
}

#### @Configuration
- A class-level annotation. 
- Tells spring that the class is to be used as a source of bean definitions. 

>@Configuration  
public class Car {
	@BeanSportCar fast() {  
		return new SportCar();  
	}  
}  

#### @Bean
- A method-level annotation.
- Tells spring that method returns a bean which is managed by the container. 

>@Bean  
public JavaBeanObject getBeanExample() {  
  return new JavaBeanObject();  
}  

#### @Component
- A class-level annotation. 
- Found during classpath and will be picked up and configured in application as a bean. 

>@Component  
public class SportCar {  
	private Car car;  
	@Autowired  
	public SportCar(Car car) {   
		this.car=car;  
	}  
}  

#### @Autowired
- Used to autowire a bean with setter methods, instance variable and constructor. 
- Spring container will try to match bean by matching datatypes. 

