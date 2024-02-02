package gr.codehub.jakartaeshopnbg.service;

import gr.codehub.jakartaeshopnbg.model.Customer;
import gr.codehub.jakartaeshopnbg.model.Product;
import gr.codehub.jakartaeshopnbg.repository.CustomerRepository;
import gr.codehub.jakartaeshopnbg.repository.ProductRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

import java.util.List;

@RequestScoped
     public class CustomerServiceImpl extends GenericServiceImpl<Customer, Long>  implements CustomerService{
}