package gr.codehub.jakartaeshopnbg.service;

import gr.codehub.jakartaeshopnbg.dto.BasketDto;
import gr.codehub.jakartaeshopnbg.dto.BasketProductDto;
import gr.codehub.jakartaeshopnbg.model.Basket;

import java.util.List;

public interface BasketService {
    Basket createBasket(BasketDto basketDto);
    Basket readBasket(int basketId);
    List<Basket> readBasket();
    Basket updateBasket(int basketId, BasketDto basketDto);
    boolean deleteBasket(int basketId);

    Basket addProductToBasket(BasketProductDto basketProductDto);
    Basket removeProductFromBasket(BasketProductDto basketProductDto);

}
