package gr.codehub.jakartaeshopnbg.service;

import gr.codehub.jakartaeshopnbg.dto.SelectBoxDto;
import gr.codehub.jakartaeshopnbg.model.Customer;
import gr.codehub.jakartaeshopnbg.repository.CustomerRepository;

import java.util.List;

public interface CustomerService  extends GenericService<Customer, Long>{

    List<SelectBoxDto> getCustomers(String starting);
    }