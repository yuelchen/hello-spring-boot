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

@Bean
- A method-level annotation.
- Tells spring that method returns a bean which is managed by the container. 

>@Bean  
public JavaBeanObject getBeanExample() {  
  return new JavaBeanObject();  
}  

