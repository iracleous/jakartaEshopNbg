package gr.codehub.jakartaeshopnbg.repository;

import gr.codehub.jakartaeshopnbg.model.Basket;
import jakarta.enterprise.context.RequestScoped;

import java.util.Optional;

@RequestScoped
public class BasketRepository extends GenericRepositoryImpl<Basket, Integer>{
    @Override
    public String getClassName() {
        return Basket.class.getSimpleName();
    }

    @Override
    public Class<Basket> getClassType() {
        return Basket.class;
    }

    @Override
    public Optional<Basket> update(Integer id, Basket newValues) {
        return Optional.empty();
    }
}
