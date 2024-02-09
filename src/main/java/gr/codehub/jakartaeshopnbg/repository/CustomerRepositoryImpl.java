package gr.codehub.jakartaeshopnbg.repository;

import gr.codehub.jakartaeshopnbg.model.Customer;
import jakarta.enterprise.context.RequestScoped;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@RequestScoped
public class CustomerRepositoryImpl extends GenericRepositoryImpl<Customer, Long> implements CustomerRepository{
    @Override
    public String getClassName() {
        return Customer.class.getSimpleName();
    }

    @Override
    public Class<Customer> getClassType() {
        return Customer.class;
    }

    @Override
    @Transactional
    public Optional<Customer> update(Long id, Customer newValues) {
        try {
            Customer customer = findById(id).get();
            customer.setEmail(newValues.getEmail());
            em.persist(customer);
            return Optional.of(customer);
        }
        catch(Exception e) {
            return Optional.empty();
        }
    }


    public List<Customer> getCustomers(String starting){
     return   em.createQuery("""
                select c
                from Customer c
                where lower(c.name) like concat(lower(:starting),'%') 
                 """,
             Customer.class)
             .setParameter("starting" ,starting )
             .getResultList();
        }


}
