package gr.codehub.jakartaeshopnbg.service;

import gr.codehub.jakartaeshopnbg.dto.BasketDto;
import gr.codehub.jakartaeshopnbg.dto.BasketProductDto;
import gr.codehub.jakartaeshopnbg.model.Basket;
import gr.codehub.jakartaeshopnbg.model.Customer;
import gr.codehub.jakartaeshopnbg.repository.BasketRepository;
import gr.codehub.jakartaeshopnbg.repository.CustomerRepository;
import gr.codehub.jakartaeshopnbg.repository.ProductRepository;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

import java.util.List;

@RequestScoped
public class BasketServiceImpl implements BasketService{

    @Inject
    private BasketRepository basketRepository;
    @Inject
    private CustomerRepository customerRepository;

    @Inject
    private ProductRepository productRepository;
    @Override
    public Basket createBasket(BasketDto basketDto) {

        Customer customer = customerRepository.findById(basketDto.getCustomerId()).get();
        Basket basket = new Basket();
        basket.setCustomer(customer);

        basketRepository.save(basket);
        return basket;
    }

    @Override
    public Basket readBasket(int basketId) {
        return null;
    }

    @Override
    public List<Basket> readBasket() {
        return null;
    }

    @Override
    public Basket updateBasket(int basketId, BasketDto basketDto) {
        return null;
    }

    @Override
    public boolean deleteBasket(int basketId) {
        return false;
    }

    @Override
    public Basket addProductToBasket(BasketProductDto basketProductDto) {

        return null;
    }

    @Override
    public Basket removeProductFromBasket(BasketProductDto basketProductDto) {
        return null;
    }
}
