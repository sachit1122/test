package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The Challenge
 * This challenge with have you build REST APIs to build the
 * CRUD Operations for a  a Simple Customer Management
 * System using Spring Boot 2, JPA and H2 database.
 * We will build the REST APIs with Spring and also use JPA, Hibernate,
 * and an H2 Embedded Database.   The Application should be build with Java 8
 * or higher and Spring Boot 2.0 or higher.
 * You will need an IDE to build the application, IntelliJ is preferred
 * but you can use another if you already have one on your machine.
 * You can download a trial version of IntelliJ at:
 * https://www.jetbrains.com/idea/download/#section=windows
 * You can choose if you want to create the project with Maven or Gradle.
 * The API should support versioning and the resource should be customer.
 * From Wade to Everyone: (5:19 PM)
 *  The REST APIS you should
 * -	Create A Customer
 * -	Retrieve A Customer By Id
 * -	Update A Customer (change emailId)
 * -	Delete A Customer By Id
 * -	Retrieve All Customers
 * -	BONUS:  Retrieve All Customers By Last Name
 * <p>
 * If time permits and as a bonus you could add paging to the REST APIs.
 * <p>
 * Steps
 * 1.	Creating the project
 * <p>
 * You can create the project by using the Spring Initializer or Spring Tool Suite or you can choose to build the project manually.
 * <p>
 * When creating the project make sure you include the start projects and dependencies that are needed based on the requirements above
 * <p>
 * 2.	Project Structure
 * <p>
 * The structure of the project should follow a standard layered approach of a Spring/Spring Boot REST application.
 * From Wade to Everyone: (5:19 PM)
 *  3.	Configuration
 * <p>
 * You can use Spring Boots Autoconfiguration to auto configure the connection the H2 database or can set up the connection manually.
 * <p>
 * 4.	Create an Entity Object
 * <p>
 * You should create a Customer Entity object with the following fields:
 * -	id – Long
 * -	firstName – String
 * -	lastName  - String
 * -	emailId – String
 * The Entity object should have the annotations required to allow it to be persisted to the H2 database.
 * <p>
 * 5.	Create a Repository
 * <p>
 * You should create a Repository that extends the JpaRepository.
 * From Wade to Everyone: (5:19 PM)
 *  6.	Build Your Controller and The Crud Operations
 * <p>
 * Create a Controller that will perform the CRUD Operations on the Customer as described above.
 * <p>
 * 7.	Run The SpringBoot Application
 * <p>
 * You should be able to now run the SpringBoot application and your REST APIs should be deployed.
 * <p>
 * 8.	Test Your REST APIs Using Postman
 * <p>
 * Create a Customer using the REST API.
 * <p>
 * Retrieve a Customer by Id.
 * <p>
 * Update a customers email.
 * <p>
 * Retrieve all customers.
 * <p>
 * Delete a Customer.
 * <p>
 * BONUS:  Search for Customers By Last Name
 * BONUS:  Test the Paging of APIs
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
