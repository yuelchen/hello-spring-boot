# About Spring Boot Cache

Caching is a mechanism or functionality where recently data is stored in memory (RAM) for a pre-defined time, so any subsequent calls for the same information can be immediately returned without having to query or await for a response from endpoint (i.e. database). This helps limit the number of database queries and speeds up more critical and fresh queries. Cached data is temporary and will expire after the pre-defined time (or when an application shuts down - whichever occurs first). Once the cache data has expired, the next call will hit the endpoint. 

### Types of Caching
- In-memory Caching
  - Caching that increase performance of an application. 
  - Most commonly associated to caching. 
  - Done by storing key-value pairs between the application and database. 
  - Popular software / approaches include Memcached and Redis.  

- Database Caching
  - Caching that improves scalability and preformance by distributing query workloads.  
  - Typically involves multiple components (i.e. clients, web-app server and database). 
  - Done to generate web pages dynamically by fetching required data from a database. 
  - Popular software / approaches include Hibernate.
  
- Web Server Caching
  - Caching that prevents application server from being overloaded and increase web page delivery speed / potential work that the backend may need to do.  
  - Done by storing data for reuse after the first request; subsequent requests of the same will serve the saved data.  
  
- Content Delivery Network (CDN) Caching
  - Caching that improves the delivery of the content by replicating commonly request files across multiple servers (i.e. HTML and CSS files). 
  - These multiple servers are known as cache edge and will serve request that are geographically close to the server location. 

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

### How does this differ from a buffer?
A buffer also stores data temporarily but specifically for writing (i.e. to another location) - not reading.   
_Note: TTL means Time To Live._

| Caching | Buffering |
| --- | --- |
| Improves READ performance. | Improves WRITE performance. |
| We read from cache. | We write into buffer. |
| TTL is typically long. | TTL is typically short. |
| Based off recently used. | Based off FIFO. |
| Stores actual data file. | Stores the data file metadata. |

### Example (Maven Dependency)
```xml:
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-cache</artifactId>
    <version>2.4.4</version>
</dependency>
```
