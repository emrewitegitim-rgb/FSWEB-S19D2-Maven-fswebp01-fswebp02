package com.workintech.s18d4.controller;

import com.workintech.s18d4.entity.Customer;
import com.workintech.s18d4.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/customer")

public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public List<Customer> getAll(){
        return customerService.findAll();
    }

    @GetMapping("/{id}")
    public Customer getById(@PathVariable Long id){
        return customerService.findById(id);
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }
    @DeleteMapping("/{id}")
    public Customer delete(@PathVariable Long id){
        return customerService.delete(id);
    }

}
