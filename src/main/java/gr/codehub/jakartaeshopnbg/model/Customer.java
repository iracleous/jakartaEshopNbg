package gr.codehub.jakartaeshopnbg.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Customer extends BaseModel{
    private String name;
    private String email;
    @OneToMany(mappedBy ="customer", fetch = FetchType.LAZY)
    private List<Basket> baskets;
}
