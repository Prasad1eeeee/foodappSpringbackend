package com.prasad.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cartItems")
@Data

public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private  Long id;

    @ManyToOne
    @JsonIgnore
    private Cart cart;

    @ManyToOne
    private  Food food;

    @Column(name = "quantity")
    private int quantity;
    @Column(name = "ingredients")
    private List<String>ingredients;
    @Column(name = "totalPrice")
    private Long totalPrice;
}
