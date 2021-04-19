# Intro to Sping Boot Starter
This repository is a collection of Spring Boot (demo) applications for the sole purpose of learning how to use the Spring Boot framework.  

## 👋 Hello 👋
If you found this work to be helpful and would like support me, please consider getting me a [☕ ko-fi](https://ko-fi.com/yuelchen) :)

## Noteworthy Mentions
You will also find documentation which was created based off a number of sources, such as:  
💎 [spring.io](https://spring.io/projects/spring-framework) - free content   
💎 [javatpoint.com](https://www.javatpoint.com/spring-boot-tutorial) - free content   
💎 [baeldung.com](https://www.baeldung.com/spring-boot) - free content   

## About Spring (in my words)
👉 Spring Boot is a powerful framework that includes a number of robust libraries that developers can use to deliever business requirements quickly; these libraries can be quickly imported via Maven or Gradle.   
👉 By using Spring Boot, developers can easily create and quickly delivery production grade application - quicker turn-around time closely attributed to being able to use imported modules, allowing more time to focus on the business logic and application rather than technical details (i.e. ldap authentication, sso management, web application and etc).  

### Take for example that you are instructed to build a new web application.  
- The web application must be secured against your company LDAP server.  
- Authorization should be role based (casual, analyst, and admin).  
- You need a REST API which will trigger some business logic to consume data from 'x' number of sources, process and publish to a database.  
- This data should be viewable from the UI.  

You could choose to create your own Java classes to handle everything from security, session handling, HTTP servlet classes, JPA implementation and etc. Alternatively, you can simply import certain dependencies such as Spring Security, Spring Web Application, Spring Data JPA, Spring JDBC and etc. Then simply leverage these packages to create your services. Don't worry if you can't see the difference now, we've got plenty of runnable projects in this repository for you to download and review. 

## Repository Overview
### Documentation (docs/)
\[[About Annotations](https://github.com/yuelchen/learn-spring-boot/blob/main/docs/annotations.md)\]
\[[About application.properties](https://github.com/yuelchen/learn-spring-boot/blob/main/docs/application-properties.md)\] 
\[[About Spring Boot Starters](https://github.com/yuelchen/learn-spring-boot/blob/main/docs/spring-boot-starters.md)\] 
\[[Spring Boot Thymeleaf](https://github.com/yuelchen/learn-spring-boot/blob/main/docs/spring-boot-starter-thymeleaf.md)\]
\[[Spring Boot Cache](https://github.com/yuelchen/learn-spring-boot/blob/main/docs/spring-boot-starter-cache.md)\]
\[[Spring Boot Data - JPA](https://github.com/yuelchen/learn-spring-boot/blob/main/docs/spring-boot-starter-data-jpa.md)\] 
\[[Spring Boot AOP](https://github.com/yuelchen/learn-spring-boot/blob/main/docs/spring-boot-starter-aop.md)\]
\[[Spring Boot Test](https://github.com/yuelchen/learn-spring-boot/blob/main/docs/spring-boot-starter-test.md)\]
\[[Spring Boot Actuator](https://github.com/yuelchen/learn-spring-boot/blob/main/docs/spring-boot-starter-actuator.md)\] 
\[[Spring Boot DevTools](https://github.com/yuelchen/learn-spring-boot/blob/main/docs/spring-boot-devtools.md)\]
\[[Deploying to Tomcat](https://github.com/yuelchen/learn-spring-boot/blob/main/docs/deploying-to-tomcat.md)\]

### Projects
#### 🎯 [spring-boot-actuator-demo](https://github.com/yuelchen/learn-spring-boot/tree/main/spring-boot-actuator-demo)/
A demo for using actuator endpoints and viewing status of application by providing URL.

#### 🎯 [spring-boot-aop-demo](https://github.com/yuelchen/learn-spring-boot/tree/main/spring-boot-aop-demo)/
A demo for using spring boot aop - aspect oriented programming. 

#### 🎯 [spring-boot-cache-demo](https://github.com/yuelchen/learn-spring-boot/tree/main/spring-boot-cache-demo)/
A demo for using spring boot cache to increase application performance for redundant calls. 

#### 🎯 [spring-boot-data-jpa-demo](https://github.com/yuelchen/learn-spring-boot/tree/main/spring-boot-data-jpa-demo)/
A demo for using spring boot data jpa and h2 database for verifying data persistence. 

#### 🎯 [spring-boot-devtools-demo](https://github.com/yuelchen/learn-spring-boot/tree/main/spring-boot-devtools-demo)/
A demo for using spring boot dev tools to automatically enforce updates without restarting. 

#### 🎯 [spring-boot-test-demo](https://github.com/yuelchen/learn-spring-boot/tree/main/spring-boot-test-demo)/
A demo for using spring boot test to ensure application functions as expected (i.e. junit). 

#### 🎯 [spring-boot-thymeleaf-demo](https://github.com/yuelchen/learn-spring-boot/tree/main/spring-boot-thymeleaf-demo)/
A demo for using spring boot thymeleaf for templating web pages to render our application dynamically. 

#### 🎯 [spring-boot-tomcat-demo](https://github.com/yuelchen/learn-spring-boot/tree/main/spring-boot-tomcat-demo)/
A demo for using spring boot to develop application and deployable to Tomcat server. 

## Additional References:  
💎 [Springboot Reference Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/index.html)  
💎 [Springboot All Guides](https://spring.io/guides)  
