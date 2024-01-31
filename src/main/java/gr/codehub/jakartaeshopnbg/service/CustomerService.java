package gr.codehub.jakartaeshopnbg.service;

import gr.codehub.jakartaeshopnbg.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer createCustomer(Customer customer);
    Customer readCustomer(int customerId);
    List<Customer> readCustomer();
    Customer updateCustomer(int customerId, Customer customer);
    boolean deleteCustomer(int customerId);

}
