package gr.codehub.jakartaeshopnbg.repository;

import gr.codehub.jakartaeshopnbg.model.Product;
import jakarta.enterprise.context.RequestScoped;
import jakarta.transaction.Transactional;

import java.util.Optional;

@RequestScoped
public class ProductRepository extends GenericRepositoryImpl<Product, Long>{
    @Override
    public String getClassName() {
        var name = Product.class.getSimpleName();
        return name ;
    }

    @Override
    public Class<Product> getClassType() {
        return Product.class;
    }

    @Override
    @Transactional
    public Optional<Product> update(Long id, Product newValues) {
        try {
            Product product = findById(id).get();
            product.setPrice(newValues.getPrice());
            em.persist(product);
            return Optional.of(product);
        }
        catch(Exception e) {
            return Optional.empty();
        }
    }

}
