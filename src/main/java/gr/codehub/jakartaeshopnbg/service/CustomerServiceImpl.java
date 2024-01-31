package gr.codehub.jakartaeshopnbg.service;

import gr.codehub.jakartaeshopnbg.model.Customer;
import gr.codehub.jakartaeshopnbg.model.Product;
import gr.codehub.jakartaeshopnbg.repository.CustomerRepository;
import gr.codehub.jakartaeshopnbg.repository.ProductRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

import java.util.List;

@RequestScoped
public class CustomerServiceImpl implements  CustomerService{
    @Inject
    private CustomerRepository customerRepository;
    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer).get();
    }

    @Override
    public Customer readCustomer(int customerId) {
        return null;
    }

    @Override
    public List<Customer> readCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer updateCustomer(int customerId, Customer customer) {
        return null;
    }

    @Override
    public boolean deleteCustomer(int customerId) {
        return false;
    }
}
