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
        try {
            em.persist(product);
            return Optional.of(product);
        }
        catch(Exception e){
            return Optional.empty();
        }
    }

    @Override
    public List<Product> findAll() {
        try {
            return em
                    .createQuery("select r from Product r")
                    .getResultList();
        }
        catch(Exception e){
            return new ArrayList<>();
        }
    }

    @Override
    public Optional<Product> findById(int id) {
        Product product;
        try{
            product=em.find(Product.class,id);
            return Optional.of(product);
        }
        catch(Exception e){
            return Optional.empty();
        }
    }

    @Override
    @Transactional
    public Optional<Product> update(int id, Product newValues) {
        try {
            Product product = em.find(Product.class, id);
            product.setPrice(newValues.getPrice());
            em.persist(product);
            return Optional.of(product);
        }
        catch(Exception e){
            return Optional.empty();
        }
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        try {
            Product product = em.find(Product.class, id);
            em.remove(product);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}
