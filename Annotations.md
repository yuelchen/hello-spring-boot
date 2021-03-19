## Spring Boot Annotations
Annotations can be thought of as metadata which provides information and guidance about the source code for our Spring boot application.  

#### @SpringBootApplication
- You can think of this as like the main method - required for each Spring. 
- Combination of three other annotations (@EnableAutoConfiguration, @ComponentScan, and @Configuration)

#### @EnableAutoConfiguration (deprecated - will not be covered)
#### @ComponentScan
- We can use it to pass the base package we'd like to scan for Spring components (beans). 
- Used with the @Configuration annotation.

```java:
@ComponentScan(basePackages = "com.yuelchen")  
@Configuration  
public class ScanBeans {  
	// code here...  
}  
```

#### @Configuration
- A class-level annotation. 
- Tells spring that the class is to be used as a source of bean definitions. 

```java:
@Configuration  
public class Car {
	@BeanSportCar fast() {  
		return new SportCar();  
	}  
}  
```

#### @Bean
- A method-level annotation.
- Tells spring that method returns a bean which is managed by the container. 

```java:
@Bean  
public JavaBeanObject getBeanExample() {  
	return new JavaBeanObject();  
} 
```

#### @Component
- A class-level annotation. 
- Found during classpath and will be picked up and configured in application as a bean. 

```java:
@Component  
public class SportCar {  
	private Car car;  
	@Autowired  
	public SportCar(Car car) {   
		this.car=car;  
	}  
}  
```

#### @Autowired
- Used to autowire a bean with setter methods, instance variable and constructor. 
- Spring container will try to match bean by matching datatypes. 

#### @Required
- Applies to the setter method of a bean. 
- Indicates that the annotated bean must be populated with required property. 
- If unpopulated, will result in an exception BeanInitilizationException.

```java:
public class Person {  
  	private String name;  
  	@Required  
  	public void setName(String name) {  
		this.name=name;  
  	}  
  	public String getName() {  
		return this.name;
  	}  
}
```

#### @Service
- A class-level annotation.
- Tells Spring that the class will contain some business logic - performs a service request. 

```java:
@Service  
public class Services {  
	public void performOilChange() {  
		// code here...  
	}  
}  
```

#### @Repository
- A class-level annotation. 
- DAO thats used to access a Database directly. 
- A repository can perform all operations relating to a database. 

```java:
@Repository   
public class EmployeeRepository  {  
	public void delete() {  
		// code here...  
	}  
}  
```

#### @Controller
- A class-level annotation. 
- Tells Spring to consider this class as a web request handler. 
- By default, will return a String that indicates route to redirect to. 
- Specialization of @Component - most commonly used with @RequestMapping annotation.

#### @RequestMapping
- Can be used as a class-level or method-level annotation. 
- Used to map web requestsand has many optional parameters:
  * consumes
  * header
  * method
  * name
  * params
  * produces
  * value

```java:
@Controller  
@RequestMapping("books")  
public class BooksController {  
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)  
	public List<Book> getBooksByName() {  
		// code here...  
		return books;  
	}  
}  
```

#### @GetMapping
- Maps the HTTP GET request to the specific handler method. 
- Typically used for a web service or operation that fetches information from an endpoint. 
- Can be used in place of @RequestMapping(method = RequestMethod.GET).

#### @PostMapping
- Maps the HTTP POST request to the specific handler method. 
- Typically used for a web service or operation that creates new information at an endpoint. 
- Can be used in place of @RequestMapping(method = RequestMethod.POST).

#### @PutMapping
- Maps the HTTP PUT request to the specific handler method. 
- Typically used for a web service or operation that updates existing information at an endpoint. 
- Can be used in place of @RequestMapping(method = RequestMethod.PUT).

#### @DeleteMapping
- Maps the HTTP DELETE request to the specific handler method. 
- Typically used for a web service or operation that removes information from an endpoint. 
- Can be used in place of @RequestMapping(method = RequestMethod.DELETE).

#### @PatchMapping
- Maps the HTTP PATCH request on the specific handler method. 
- Can be used in place of @RequestMapping(method = RequestMethod.PATCH).

#### @PathVariable
- Used to extract the values from the given URI. 
- Typically used in conjunction with RESTful web service, where the URL contains a path variable (i.e. "/id/{id}").
- There can be multiple @PathVariable for a single method. 

#### @RequestBody
- Used to bind the HTTP request with an object in a method parameter. 
- In the background, this annotation will take the method parameter and convert it to an HTTP message body. 

#### @RequestAttribute
- Used to bind a method parameter to a request attribute. 
- We can use @RequestAttribute annotation to access objects populated on server side from controller method.

#### @RequestParam
- Used to extract the query parameters from the URL. 
- Typically used in conjunction with web application, and can specify defauly values if parameter is null.
- Also known as a query parameter (i.e. "/books?start=0&size=50&category=horror").

#### @RequestHeader
- A method-level annotation. 
- Used to retrieve the header fields for an HTTP request. 
- For each header field, we should specify a separate annotation. 
- The optional elements of the annotation are:
  * name
  * required
  * value
  * defaultValue
- There can be multiple @RequestHeader for a single method. 

#### @ResponseBody
- Used to bind the HTTP response body to the method return type. 
- In the background, this annotation will tell Spring to serialize the response body into JSON / XML format. 

#### @RestController
- Combination of @Controller and @ResponseBody. 
- Can be annotated along with @ResponseBody which will remove the need to annotate @ResponseBody for each method. 
