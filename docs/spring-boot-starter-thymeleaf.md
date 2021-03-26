# About Spring Boot Thymeleaf

Thymeleaf is an open-source Java library for creating XML/XHTML/HTML5 templates for serving web pages (and non-web - offline - environments). You can consider Thymeleaf as the substitute or replacement of JSP (JavaServer Pages). By using Thymeleaf, we can create and define templates our web application should serve and populate values or information dynamically with the least amount of I/O operations during execution. 

### Templates Supported:
1. XML
2. XHTML
3. HTML5 (including legacy)

### Noteable Benefits over JSP:
- Thymeleaf is more closely formatted as HTML so it wins in terms of readability. 
- Supports easy to read variable expression (i.e. ${variable-name})

### Example (Maven Dependency):
```xml:
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
    <version>2.4.4</version>
</dependency>
```
