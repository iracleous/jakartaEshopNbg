package gr.codehub.jakartaeshopnbg.dto;

import lombok.Data;

@Data
public class BasketProductDto {
    private long basketId;
    private long productId;
    private int quantity;
}
