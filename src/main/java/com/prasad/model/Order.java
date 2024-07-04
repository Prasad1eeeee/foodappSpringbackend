
package com.prasad.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    @JsonIgnore
    private Restaurant restaurant;

    @Column(name = "totalAmount")
    private Long totalAmount;

    @Column(name = "orderStatus")
    private String orderStatus;

    @Column(name = "createdAt")
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address deliveryaddress;

    @OneToMany(mappedBy = "order")
    private List<OrderItems> orderItems;

    @Column(name = "totalItems")
    private int totalItems;

    @Column(name = "totalPrice")
    private int totalPrice;

    // private Payment payment;
}
