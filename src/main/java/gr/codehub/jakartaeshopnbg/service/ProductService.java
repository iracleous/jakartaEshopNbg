package gr.codehub.jakartaeshopnbg.service;

import gr.codehub.jakartaeshopnbg.model.Product;

import java.util.List;

public interface ProductService {
     Product createProduct(Product product);
     Product readProduct(int productId);
     List<Product> readProduct();
     Product updateProduct(int productId, Product product);
     boolean deleteProduct(int productId);
}
