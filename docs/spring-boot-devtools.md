# About Spring Boot DevTools

The DevTool package - Developer Tool - is used for developing Spring Boot applications. 
This package will pick up any changes and restart the application. 

DevTool Features:
- Automatic Restarts
  * Server-side changes are automatically implemented with server restart
  * Handled by property _**spring.devtools.restart.enabled**_.
  * The DevTool will always need to monitor class path in order to trigger restart. 
  * Upon restarting, class loader is thrown away and reloaded. 
  * There are two class loaders:
    * base ClassLoader
    * restart ClassLoader
  * Mostly required in mircoservice applications. 
  * Works well with LiveReload.

- LiveReload
  * An embedded server which allows the application to automatically trigger a browser refresh whenever there are changes.
  * Handled by property _**spring.devtools.livereload.enabled**_.
  * Also known as auto-refresh. 
  * Works for the following paths:
    * /resources
    * /templates
    * /static
    * /public
    * /META-INF/maven
    * /META-INF/resources

- Property Defaults
  * Web application package (Thymeleaf) has configuration to disable caching. 
  * Handled by property _**spring.thymeleaf.cache**_.
  * Disabling will allow us to make changes without having to restart the application.   

- Remote Debug Tunneling
  * Can tunnel Java Debug Wire Protocol over HTTP.
  * Can deploy application to Cloud Providers over port 80/443. 

- Remote Update and Restart
  * Supports application updates and restarts by monitoring local classpath for file changes. 
  * The file changes are pushed to a remote server before restarting to apply changes. 
  * This is used in combination with LiveReload. 

### Recommendation: User a TRIGGER file
If you plan to use DevTool, use a trigger file to trigger your restarts rather than whenever there are changes applied. 
Frequent restarts can cause downtime and also slow development due to increasing amount of restarts. 
A trigger file can be implemented by using the property _**spring.devtools.restart.trigger-file**_.
```:
spring.devtools.restart.trigger-file=c:/user/home/eclipse-workspace/app-name/restart-trigger.txt  
```

### Example (Maven Dependency):
```:
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-devtools</artifactId>
  <version>2.3.4.RELEASE</version>
  <scope>runtime<scope >  
</dependency>
```
