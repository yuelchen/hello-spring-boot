# about application.properties

Spring Boot has a built-in configuration file called application.properties. 

This file can typically be found underneath your project folder with the given path: src/main/resource

This properties file comes with some default values (whether or not they are defined in you properties file). 

We can also use this file to drive our own custom properties (if we wanted to). 

Note: To comment in application.properties, simply prefix it with the '#' symbol. 

### Spring Boot Properties with Default Values
| Property Name | Default Value | Short Description |
|---|---|---|
| Debug | false | Used to enable debug logs. |
| spring.application.admin.enabled | false | Used to enable admin features. |
| spring.config.name | application | Used to set configuration file name. |
| server.port | 8080 | Used to determine the HTTP server port. |
| spring.banner.charset | UTF-8 | The encoding type for banner file. |
| spring.banner.location | classpath:banner.txt | The location for banner file. |
| spring.mail.test-connection | false | USed to test if fail server is available at start-up. |
| server.servlet-path | / | Used to set the path of the main dispatcher servlet. |
| spring.http.multipart.enabled | true | Used to enable multi-part upload support. |
| spring.servlet.multipart.max-file-size | 1 MB | Used to set the max file size for multi-part upload. |
| security.basic.authorize-mode | role | Used to set security authorization mode (if applicable). |
| security.basic.enabled | true | Used to enable basic authentication (if applicable). |
| spring.test.database.replace | any | Type of existing data source to replace. |
| spring.text.mockmvc.print | default | The print option for Model View Controller. |
| spring.freemaker.content-type | text/html | The content-type for web application. |
| spring.security.filter.dispatcher-type | asyn, error, request | The dispatcher types for security filter chain. |
| spring.security.filter.order | -100 | The order for security filter chain. |

### Spring Boot Properties without Default Values
| Property Name | Short Description |
|---|---|
| spring.application.name | Used to set the application name. |
| spring.application.index | Used to set the application index. |
| spring.config.location | Used to determine the location for configuration file. |
| server.servlet.context-path | Used to set the context-path of the application. |
| logging.file.path | Used to set the location of the log file. |
| logging.file | Used to set the log file name. |
| spring.mail.host | Used to set the SMTP server host. |
| spring.mail.username | The login password for the SMTP server. |
| spring.mail.password | The login password for the SMTP server. |
| spring.mail.port | The SMTP server host port. |
| spring.main.sources | Used to set the sources of the application. |
| server.address | Used to set the network address to which server should bind to. |
| server.connection-timeout | Used to determine how long an HTTP request should wait for response (in milliseconds). |
| server.server-header | Used for the server response header. |
| server.ssl.enabled | Used to enable SSL support. |
| spring.mvc.async.request-timeout | Used to determine wait time for response to mvc request (in milliseconds). |
| spring.mvc.date-format | Used to set the date format. | 
| spring.mvc.locale | Used to set locale. |
| spring.social.facebook.app-id | Used to set application facebook application Id (if applicable). |
| spring.social.linkedin.app-id | Used to set application linkedin application Id (if applicable). |
| spring.social.twitter.app-id | Used to set application twitter application Id (if applicable). |
| server.server-header | To be used to retrieve value from server response header. |
| spring.security.oauth2.client.registration.* | OAuth client registration details. |
| spring.security.oauth2.client.provider.* | OAuth provider details. |

Example of an application.properties:
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
