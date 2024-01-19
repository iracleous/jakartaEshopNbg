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

    private static final ArrayList<Product> products = new ArrayList<>();

    @Override
    public Product createProduct(Product product) {
        products.add(product);
        return product;
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
