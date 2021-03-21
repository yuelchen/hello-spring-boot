# Learn Spring Boot

## Description
This repository is a collection of Spring Boot (demo) applications for the sole purpose of learning how to use the Spring Boot framework. 

## Noteworthy Mentions
You will also find documentation which was created based off a number of sources, such as:
- [spring.io](https://spring.io/projects/spring-framework) - free
- [javatpoint.com](https://www.javatpoint.com/spring-boot-tutorial) - free
- [baeldung.com](https://www.baeldung.com/spring-boot) - free

## About Spring (in my words)
Spring Boot is a powerful framework that include a number of robust libraries that developers can use to deliever business requirements quickly. 

Take for example that you are instructed to build a new web application. 
- The web application must be secured against your company LDAP server. 
- Authorization should be role based (casual, analyst, and admin). 
- You need a REST API which will trigger some business logic to consume data from 'x' number of sources, process and publish to a database. 
- This data should be viewable from the UI. 

You could choose to create your own Java classes to handle everything from security, session handling, HTTP servlet classes, JPA implementation and etc. Alternatively, you can simply import certain dependencies such as Spring Security, Spring Web Application, Spring Data JPA, Spring JDBC and etc. Then simply leverage these packages to create your services. Don't worry if you can't see the difference now, we've got plenty of runnable projects in this repository for you to download and review. 

## Repository Overview
### Documentation (docs/)
\[[About Annotations](https://github.com/yuelchen/learn-spring-boot/blob/main/docs/annotations.md)\]
\[[About Spring Starters](https://github.com/yuelchen/learn-spring-boot/blob/main/docs/spring-boot-starters.md)\] 
\[[About application.properties](https://github.com/yuelchen/learn-spring-boot/blob/main/docs/application-properties.md)\] 
\[[Spring Data JPA](https://github.com/yuelchen/learn-spring-boot/blob/main/docs/spring-boot-data-jpa.md)\] 
\[[Spring Actuator](https://github.com/yuelchen/learn-spring-boot/blob/main/docs/spring-boot-actuator.md)\] 

### Projects
#### [spring-boot-data-jpa-demo]()/
A demo for using spring boot data jpa and h2 database for verifying data persistence. 

#### [spring-boot-actuator-demo]()/
A demo for using actuator endpoints and viewing status of application by providing URL. 
