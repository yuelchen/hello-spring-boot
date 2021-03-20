# About application.properties

Spring Boot has a built-in configuration file called application.properties. 

This file can typically be found underneath your project folder with the given path: src/main/resource

This properties file comes with some default values (whether or not they are defined in you properties file). 

We can also use this file to drive our own custom properties (if we wanted to). 

*Note: To comment in application.properties, simply prefix it with the '#' symbol.*

### Spring Boot Property Categories
1. Server
2. Security
3. Web
4. Mail
5. Core
6. Cache
7. JSON
8. Data
9. Data Migration
10. Integration
11. Transaction
12. RSocket
13. Actuator
14. Templating
15. DevTools
16. Testing

### See Full List of Spring Boot Properties for each Category:
https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html

### Example: application.properties:
```
# Server Details
server.port=8081

# SMTP Details
spring.mail.host=smtp-development.gmail.com
spring.mail.port=465
spring.mail.username=development
spring.mail.password=pass@123

# Application Details
spring.application.name=Cars
```
