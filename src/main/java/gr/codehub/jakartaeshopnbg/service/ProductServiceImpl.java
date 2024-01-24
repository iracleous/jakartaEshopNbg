package gr.codehub.jakartaeshopnbg.service;

import gr.codehub.jakartaeshopnbg.model.Product;
import gr.codehub.jakartaeshopnbg.repository.ProductRepository;
import gr.codehub.jakartaeshopnbg.resource.ProductResource;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jdk.jfr.Name;

import java.beans.BeanProperty;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
public class ProductServiceImpl implements ProductService {

    @Inject
    private ProductRepository productRepository;
    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product).get();
    }

    @Override
    public Product readProduct(int productId) {
        return productRepository.findById(productId).get();
    }

    @Override
    public List<Product> readProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(int productId, Product product) {
        return productRepository.update(productId, product).get();
    }

    @Override
    public boolean deleteProduct(int productId) {
        return productRepository.delete(productId);
    }
}
