package com.aygunestolga.customerservice.service;

import com.aygunestolga.customerservice.model.Customer;
import com.aygunestolga.customerservice.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }


    public Customer getCustomerById(String id) {
        return customerRepository.findById(id)
                .orElse(null);
    }

    public Customer updateCustomer(String id, Customer newCostumer) {
        Customer customer = getCustomerById(id);
        if (customer != null){
            customer.setFirstName(newCostumer.getFirstName());
            return customerRepository.save(customer);
        }
            return null;
    }

    public void deleteCustomer(String id) {
        customerRepository.deleteById(id);
    }
}
