package com.aygunestolga.customerservice.repository;

import com.aygunestolga.customerservice.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CustomerRepository extends MongoRepository<Customer, String> {

}
