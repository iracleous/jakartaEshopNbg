package gr.codehub.jakartaeshopnbg.repository;

import gr.codehub.jakartaeshopnbg.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    Optional<Product> save(Product product);
    List<Product> findAll();
    Optional<Product> findById(int id);
    Optional<Product> update(int id, Product newValues);
    boolean delete(int id);
}
