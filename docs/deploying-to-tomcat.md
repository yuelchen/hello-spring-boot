# Deploying to Tomcat

We will need to create a SpringBoot WAR (Web Application Resource or Web application ARchive).

Requirments to configure application for WAR file:
1. Create a class which extends to SpringBootServletInitializer in the _**main**_ class:
```java:
public class Application extends SpringBootServletInitializer { 
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}  
```

2. Override the configure method:
```java:
protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {  
  return application.sources(Application.class);  
}   
```

3. Add Tomcat dependency to pom.xml (with provided scope):
```xml:
<!-- By default, tomcat will use version 7, use below line if you want a specific version (i.e. 8) -->
<properties>
  <tomcat.version>8.0.3</tomcat.version>
</properties>

<dependency>  
  <groupId>org.springframework.boot</groupId>  
  <artifactId>spring-boot-starter-tomcat</artifactId>  
  <scope>provided</scope>  
</dependency>    
```

4. Update our packaging to a be a WAR file (by default, it's a jar). 
```xml:
<packaging>war</packaging>  
```

5. (Optional) We can update the final name of the project.
```xml:
<finalName>web-application</finalName>  
```

### Example (Application.java):
```java:
public class Application extends SpringBootServletInitializer { 
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
  
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {  
    return application.sources(Application.class);  
  }
} 
```

### Example (pom.xml):
```xml:
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>

<!-- Project Information -->
<groupId>com.yuelchen</groupId>
<artifactId>spring-boot-tomcat-demo</artifactId>
<version>0.0.1-SNAPSHOT</version>
<name>spring-boot-tomcat-demo</name>
<description>Demo project for Spring Boot Tomcat.</description>

<!-- Packaging Format-->
<packaging>war</packaging> 

<!-- Project Java Version -->
<properties>
<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding> 
<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>  
<java.version>13</java.version>
<tomcat.version>8.0.3</tomcat.version>
</properties>

<!-- Project Build Information -->
<build>
<finalName>web-application</finalName>
<plugins>
<plugin>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-maven-plugin</artifactId>
</plugin>
</plugins>
</build>

  <!-- Parent Dependency -->
  <parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.4.4</version>
    <relativePath/>
  </parent>

  <dependencies>
    <!-- Spring Boot Starter for Web Application -->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Spring Boot Starter Thymeleaf -->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-tomcat</artifactId>
      <scope>provided</scope>  
    </dependency>

    <!-- Spring Boot Starter for Testing -->
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-test</artifactId>
      <scope>test</scope>
    </dependency>
  </dependencies>
</project>
```
