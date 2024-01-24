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
        return null;
    }

    @Override
    public List<Product> readProduct() {
        return null;
    }

    @Override
    public Product updateProduct(int productId, Product product) {
        return null;
    }

    @Override
    public boolean deleteProduct(int productId) {
        return false;
    }
}
