package by.jrr.customer.service;

import by.jrr.customer.entity.CustomerEntity;

import java.util.Collection;

public interface CustomerService {
    CustomerEntity createCustomer(String name, String email, String address);

    Collection<CustomerEntity> listAll();
}
