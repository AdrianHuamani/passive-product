package com.bootcamp.passiveProduct.service.impl;

import com.bootcamp.passiveProduct.domain.Customer;
import com.bootcamp.passiveProduct.repository.CustomerRepository;
import com.bootcamp.passiveProduct.repository.GenericRepository;
import com.bootcamp.passiveProduct.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl extends CrudImpl<Customer,String> implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    protected GenericRepository<Customer,String> getRepo() {return customerRepository;}
}
