package gr.codehub.jakartaeshopnbg.repository;

import gr.codehub.jakartaeshopnbg.model.Customer;
import gr.codehub.jakartaeshopnbg.repository.GenericRepositoryImpl;
import jakarta.enterprise.context.RequestScoped;
import jakarta.transaction.Transactional;

import java.util.Optional;

@RequestScoped
public class CustomerRepository extends GenericRepositoryImpl<Customer, Integer> {
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
    public Optional<Customer> update(Integer id, Customer newValues) {
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

}
