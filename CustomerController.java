package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

    private final CustomerRepository repository;

    @Autowired
    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    //Create A Customer
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer createCustomer(@RequestBody Customer customer) {
        LOGGER.info("Creating a new customer {}", customer);

        return this.repository.save(customer);
    }

    //Retrieve All Customers
    @GetMapping
    public List<Customer> getAllCustomers(@RequestParam(required = false) String lastName) {
        LOGGER.info("Getting all customers lastName={}",  lastName);
        List<Customer> allCustomers = Optional.ofNullable(lastName)
                .map(ln -> this.repository.findByLastName(ln))
                .orElseGet(
                        this.repository::findAll
                );


        return allCustomers;
    }

    //Retrieve A Customer By Id
    @GetMapping("/{id}")
    public Customer getById(@PathVariable Long id) {
        LOGGER.info("Getting a customer by id={}", id);

        return this.repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    //Update A Customer (change emailId)
    @PutMapping("/{id}")
    public Customer update(@PathVariable Long id, @RequestBody Customer customer) {
        LOGGER.info("Updating customer {}", customer);

        return this.repository.save(customer);
    }

    //Delete A Customer By Id
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        LOGGER.info("Deleting customer with id={}", id);

        this.repository.deleteById(id);
    }
}
