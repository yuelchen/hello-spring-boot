# About Spring Boot Actuator 

The Spring Boot actuator is a production ready package that can be imported to help monitor and manage your application. 

### There are three main features:
1. Endpoints
   - Spring Boot provides a number of built-in endpoints; you can specify your own as well. 
   - These endpoints can be monitored and managed by the application. 
   - Popularily, many incorporate actuators through HTTP requests by specifying the Id of an endpoint and a mapped URL in a controller. 

2. Metrics
   - Spring Boot is integrated with micrometer which provides metrics for you application. 
   - These metrics can provide information such as task timers, counters and etc. 
   
3. Audit
   - Spring Boot provides an audit framework which writes to an AuditEventRepository - this is done automatically in the event Spring Security is enabled. 

### Actuator Endpoint Id's 
| Endpoint Id | Short Description | Default (Enabled) | 
| --- | --- | --- |
| actuator | Provides a hypermedia discovery page for other endpoints. | True |
| auditevents | Provides audit event information. | True |
| autoconfig | Provides a report for auto-configuration (including why they were or were-not applied). | True |
| beans | Provides a display of all Spring beans in application. | True |
| configprops | Provides a display of all @ConfigurationProperties. | True |
| dump | Performs a thread dump. | True |
| env | Exposes properties in Spring ConfigurationEnvironment. | True |
| flyway | Shows any Flyway database migrations that have been applied. | True |
| health | Shows the application health information. | False |
| info | Provides application information for curent application. | False |
| loggers | Provides a way to modify and show the configuration loggers. | True |
| liquibase | Shows any Liquibase database migrations that have been applied. | True |
| metrics | Provides metric information for the current application. | True |
| mappings | Provides a display of all @RequestMapping paths. | True |
| shutdown | Allows the application to gracefully shutdown. | True |
| trace | Shows the application trace information. | True |

### Actuator Endpoint Id's (Spring MVC)
| Endpoint Id | Short Description | Default (Enabled) | 
| --- | --- | --- |
| docs | Used to display documentation. | False | 
| heapdump | Used to return a Gzip compressed hprof (Heap/CPU Profiling) heap dump file. | True |
| jolokia | Used to expose JMX beans over HTTP. | True |
| logfile | Used to return the contents of the log file. | True |
| prometheus | Used to expose metrics in a format that can be taken into Prometheus server - requires micrometer-registry-prometheus dependency. | True |

### Example (Maven Dependency):
```:
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
    <version>2.3.4.RELEASE</version>
</dependency>
```

### Example (application.properties):
```:
management.security.enabled=true  
management.security.roles=ADMIN  
security.basic.enabled=true  
security.user.name=admin  
security.user.passowrd=password  
```
