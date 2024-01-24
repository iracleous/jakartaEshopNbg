package gr.codehub.jakartaeshopnbg.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @NotNull
    private Customer customer;

    @ManyToMany
    private List<Product> products;
}
