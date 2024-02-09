package gr.codehub.jakartaeshopnbg.service;

import gr.codehub.jakartaeshopnbg.dto.SelectBoxDto;
import gr.codehub.jakartaeshopnbg.model.Customer;
import gr.codehub.jakartaeshopnbg.repository.CustomerRepository;
import jakarta.enterprise.context.RequestScoped;

import java.util.List;
import java.util.stream.Collectors;

@RequestScoped
     public class CustomerServiceImpl extends GenericServiceImpl<Customer, Long>  implements CustomerService{


    public List<SelectBoxDto> getCustomers(String starting){
         CustomerRepository customerRepository = (CustomerRepository)  genRepository;
         return customerRepository.getCustomers(starting)
                 .stream()
                 .map(customer -> new SelectBoxDto(customer.getName(), customer.getId().toString()))
                 .collect(Collectors.toList());
    }
  }