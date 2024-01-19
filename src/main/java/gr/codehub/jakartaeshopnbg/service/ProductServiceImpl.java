package gr.codehub.jakartaeshopnbg.service;

import gr.codehub.jakartaeshopnbg.model.Product;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jdk.jfr.Name;

import java.beans.BeanProperty;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
public class ProductServiceImpl implements ProductService {
    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product readProduct(int productId) {
        Product product = new Product();
        product.setId(productId);
        product.setName("chips");
        return product;
    }

    @Override
    public List<Product> readProduct() {
        List<Product> products = new ArrayList<>();
        Product product = new Product();
        product.setId(20);
        product.setName("chips");
        products.add(product);
        return products;
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
