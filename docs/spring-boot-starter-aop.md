# About Spring Boot AOP (Aspect-Oriented Programming)

AOP is a solution to implement required functionality across multiple layers in a Java Web Application.

### The Three Layers
1. Web Layer
   - The services exposed over REST API or Web UI. 
2. Business Layer
   - The business logic implementation of an application (i.e. determining what to do with request). 
3. Data Layer
   - The actual persistence of data of an application. 

### What are Cross-cutting Concerns?
Cross-cutting concerns are common functionality that is required across multiple layers. 
Such functionality include but not limited to logging, security, caching and etc.

### Benefits of AOP?
AOP allows us to manage and maintain our code more easily since we only need to define cross-cutting functionality once. 
Once we hace defined these classes, we simply apply them to the layers we need them. 
These cross-cutting classes are called aspect in AOP. 

### Terms & Terminology 
- Aspect
  - A module used to provide cross-cutting functionality. 
  - Can be implemented using @Aspect annotation.  
- Advice
  - An action that is taken before or after method execution. 
  - These 5 actions or methods can be before, after, around, after-returning, and after-throwing. 
    - **Before**: _Exectued before join point and called before advice; @Before annotation._  
    - **After**: _Executed after joint point and called after advice; @After annotation. _
    - **Around**: _Executed before and after join point, but is called around advice._
    - **After Returning**: _Executed when a method executes successfully. _
    - **After Throwing**: _Executed when a join point throws an exception._
  - Advices are taken from a particular join point. 
- Join point
  - A point in the application where we apply AOP Aspect. 
  - It can be considered as a method execution, exception handling, or changing the value of a variable. 
- Pointcut
  - An expression that selects one or more join points where advice is executed.
  - Pointcuts are defined using expressions or patterns. 
- Target object
  - The object where advice(s) are applied is a target object. 
- Weaving
  - The process of linking aspects with other application types. 
  - This can be performed at runtime, load time, and compile time. 
- Proxy
  - An object created after applying advice to a target object. 
  - Proxy classes created from Spring AOP using JDK dynamic proxy with target classes and advice invocations. 

### Aspect Object Programming (AOP) versus Object Oriented Programming (OOP)
| Aspect Object Programming (AOP) | Object Oriented Programming (OOP) |
| --- | --- |
| Aspect | Class |
| Pointcut | Method Signature | 
| Advice | Method Body |
| Waver | Compiler |

### Example (Maven Dependency):
```xml:
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-aop</artifactId>
  <version>2.4.4</version>
</dependency>
```
