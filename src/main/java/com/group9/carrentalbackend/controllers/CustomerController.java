package com.group9.carrentalbackend.controllers;

import com.group9.carrentalbackend.exceptions.CustomerAlreadyExistException;
import com.group9.carrentalbackend.models.Customer;
import com.group9.carrentalbackend.models.Rental;
import com.group9.carrentalbackend.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
class CustomerController {
    private final CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }
    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.updateCustomer(customer);
}
    @DeleteMapping("/{id}")
    public Customer deleteCustomer(@PathVariable Long id) {
        return customerService.deleteCustomer(id);
    }

}
