# About Spring Boot Cache

Caching is a mechanism or functionality where recently data is stored in memory (RAM) for a pre-defined time, so any subsequent calls for the same information can be immediately returned without having to query or await for a response from endpoint (i.e. database). This helps limit the number of database queries and speeds up more critical and fresh queries. Cached data is temporary and will expire after the pre-defined time (or when an application shuts down - whichever occurs first). Once the cache data has expired, the next call will hit the endpoint. 

### How does this look like in an Spring Boot application?
1. Method invocation occurs. 
2. Cached results are checked to match against method invocation. 
   a. if found, proceed to return the cached results.
   b. if not found, proceed to execute method invocation and return results. 

### How do we enable caching?
We need to do two things:
1. We need to declare which method requires caching (cache declaration). 
2. We need to configure the cache for where data will be stored and read from (cache configuration). 

### When should we use / enable caching?
We should limit the ability for caching to method invocations whose results or response doesn't change often. Take into consideration READ queries from a database, where the data field being returned doesn't change (i.e. a user's birth date). The reason you only want to do this for infrequently updated data is to keep your responses as fresh as possible, all the while minimizing the amount of queries or request to your underlying database. This will give better performance for all users while providing the most update responses. 

### Example (Maven Dependency)
```xml:
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-cache</artifactId>
    <version>2.4.4</version>
</dependency>
```
