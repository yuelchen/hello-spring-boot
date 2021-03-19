# learn-spring-boot

## Spring Boot Annotations
Annotations can be thought of as metadata which provides information and guidance about the source code for our Spring boot application.  

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

#### @Required
- Applies to the setter method of a bean. 
- Indicates that the annotated bean must be populated with required property. 
- If unpopulated, will result in an exception BeanInitilizationException.

>public class Person {  
  	private String name;  
  	@Required  
  	public void setName(String name) {  
    	this.name=name;  
  	}  
  	public String getName() {  
    	return this.name;
  	}  
}

#### @Service
- A class-level annotation.
- Tells Spring that the class will contain some business logic - performs a service request. 

>@Service  
public class Services {  
	public void performOilChange() {  
		// code here...  
	}  
}  

#### @Repository
- A class-level annotation. 
- DAO thats used to access a Database directly. 
- A repository can perform all operations relating to a database. 

>@Repository   
public class EmployeeRepository  {  
	public void delete() {  
		// code here...  
	}  
}  

#### @Controller
- A class-level annotation. 
- Tells Spring to consider this class as a Web request handler. 
- By default, will return a String that indicates route to redirect to. 
- Specialization of @Component - most commonly used with @RequestMapping annotation.

>@Controller  
@RequestMapping("books")  
public class BooksController {  
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)  
	public List<Book> getBooksByName() {  
		// code here...  
		return books;  
	}  
} 
