# About Spring Data JPA

## JPA (Oracle Java)
JPA stands for Java Persistence API, which is a collection of classes or / and methods which persists vast amounts of data into a database.  
The JPA serves as a source to store business entities as relational entities by defining a POJO (Plain Old Java Object).  
This allows developers to forgo the burden of writing heavy code which closely interacts with the database layer / instance.  

#### What makes up the persistence for JPA API?
- Persistence: The class which contains static methods to obtain an instance of EntityManagerFactory. 
- EntityManagerFactory: Factory class for EntityManager, which creates and manages multiple EntityManager instances. 
- EntityManager: An interface which manages the persistence operations on objects (like factory for Query instances - can have many query instances). 
- Query: An interface which is implemented by each JPA vendor to obtain relational objects which meet query criteria. 
- EntityTransaction: Each EntityManager has a single EntityManager where operations are maintained. 
- Entity: The actual persistence objects which are stored as records in a database. 

#### Relationships persistence for JPA APi
- EntityManagerFactory to EntityManager: one-to-many
- EntityManager to Query: one-to-many
- EntityManager to Entity: one-to-many
- EntityManager to EntityTransaction: one-to-one

#### How does mapping works?
- Mapping is taken care of by an ORM.xml file - a mapping configuration between the data in a POJO class and data in a relational database. 
- For a detailed overview on mapping: https://www.tutorialspoint.com/jpa/jpa_orm_components.htm

## Spring Data JPA 
Spring Data JPA is a Spring implementation using underlying JPA in Java (provided by oracle).  
Instead of having to implement the relationship classes for persistence, Spring Data JPA saves us this work.  

#### Three main features:
- No code repository. 
- Provides default implementation for each method so no need for read / write operations. 
- Generated queries based on method name (i.e. findBy prefix used for method named findByName(String name)).

#### Example (Maven Dependency):
```:
<dependency>  
    <groupId>org.springframework.boot</groupId>  
    <artifactId>spring-boot-starter-data-jpa</artifactId>  
    <version>2.3.4.RELEASE</version>  
</dependency>  
```

#### Example (EmployeeRepo):
```java:
/* The EmployeeRepo class extends to CrudRepository which is a Spring Data JPA class. 
 * The CrudRepository offers standard CREATE, READ, UPDATE and DELETE operations 
 * based off method names like findOne(), findAll(), save(), delete(), and etc. 
 * 
 * We've defined two generics, where Employee is the entity and Integer is the data type for primary key. 
 * As for the method, Spring will internally generate a query (JPQL) based on the method name we've defined in the interface. 
 */
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

    // the below method will return an Employee object based off the given Id
    public Employee findById(long id);
}
```

#### Types of Spring Data Repository:
1. CrudRepository
   - Offers standard operations such as CREATE, READ, UPDATE and DELETE. 
   - Methods are mapped based off naming convention, such as findOne(), findAll(), save(), delete() and etc.
2. PagingAndSortingRepository
   - Extends to CrudRepository and adds to findAll() functionality - allowing us to paginate results.   
3. JpaRepository
   - Extends both the CrudRepository and PagingAndSortingRepository. 
   - Adds additional JPA-specific methods such as flush() - triggers the flush on persistence context.

#### What we need to handle for JPA with Spring?
1. Entity Manager
   - Will handle all interactions with the database once mapping is defined. 
2. JPQL (Java Persistence Query Language)
   - Write additional conditions for queries if needed (JPQL will already understanding the entity through mapping).  
3. Criteria API
   - Define Java-based API to execute queries against database. 
