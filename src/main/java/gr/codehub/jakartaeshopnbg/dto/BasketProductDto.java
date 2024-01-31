package gr.codehub.jakartaeshopnbg.dto;

import lombok.Data;

@Data
public class BasketProductDto {
    private int basketId;
    private int productId;
    private int quantity;
}
