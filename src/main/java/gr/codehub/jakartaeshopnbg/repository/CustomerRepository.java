package gr.codehub.jakartaeshopnbg.repository;

import gr.codehub.jakartaeshopnbg.model.Customer;

import java.util.List;

public interface CustomerRepository extends GenericRepository<Customer, Long>  {

    List<Customer> getCustomers(String starting);
}
