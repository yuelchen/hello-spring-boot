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
| beans | Provides a complete list of all Spring beans in application. | True |
