package gr.codehub.jakartaeshopnbg.repository;

import gr.codehub.jakartaeshopnbg.model.Product;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequestScoped
public class ProductRepositoryImpl implements ProductRepository{
    @PersistenceContext(unitName = "Persistence")
    private EntityManager em;

    @Override
    @Transactional
    public Optional<Product> save(Product product) {
        em.persist(product);
        return Optional.of(product);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>();
    }

    @Override
    public Optional<Product> findById(int id) {
        return Optional.empty();
    }

    @Override
    public Optional<Product> update(int id, Product newValues) {
        return Optional.empty();
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
