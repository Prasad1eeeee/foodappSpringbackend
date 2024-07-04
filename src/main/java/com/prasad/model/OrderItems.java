package com.prasad.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orderItems")

public class OrderItems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "food_id")  // Corrected here
    private Food food;

    @Column(name = "quantity")
    private  int quantity;

    @Column(name = "totalPrice")
    private Long totalPrice;

    @Column(name = "ingredients")
    private List<String>ingredients;

}
