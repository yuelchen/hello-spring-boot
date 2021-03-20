# About Spring Data JPA

### JPA (Oracle Java)
JPA stands for Java Persistence API, which is a collection of classes or / and methods which persists vast amounts of data into a database. 

The JPA serves as a source to store business entities as relational entities by defining a POJO (Plain Old Java Object).

This allows developers to forgo the burden of writing heavy code which closely interacts with the database layer / instance. 

What makes up the persistence for JPA API?
- Persistence: The class which contains static methods to obtain an instance of EntityManagerFactory. 
- EntityManagerFactory: Factory class for EntityManager, which creates and manages multiple EntityManager instances. 
- EntityManager: An interface which manages the persistence operations on objects (like factory for Query instances - can have many query instances). 
- Query: An interface which is implemented by each JPA vendor to obtain relational objects which meet query criteria. 
- EntityTransaction: Each EntityManager has a single EntityManager where operations are maintained. 
- Entity: The actual persistence objects which are stored as records in a database. 

Relationships persistence for JPA APi
- EntityManagerFactory to EntityManager: one-to-many
- EntityManager to Query: one-to-many
- EntityManager to Entity: one-to-many
- EntityManager to EntityTransaction: one-to-one

How does mapping works?
- Mapping is taken care of by an ORM.xml file - a mapping configuration between the data in a POJO class and data in a relational database. 
- For a detailed overview on mapping: https://www.tutorialspoint.com/jpa/jpa_orm_components.htm

### Spring Data JPA 
Spring Data JPA is a Spring implementation using underlying JPA in Java (provided by oracle). 
