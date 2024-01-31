package gr.codehub.jakartaeshopnbg.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDateTime timeStamp;

    @ManyToOne
    @NotNull
    private Customer customer;

    @ManyToMany
    private List<Product> products;
}
