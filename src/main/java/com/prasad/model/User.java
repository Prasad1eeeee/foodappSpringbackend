package com.prasad.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.prasad.dto.RestaurantDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.List;

@Entity
@Data@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")

public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String fullname;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private USER_ROLE role;

    @Column(name = "order")
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true,mappedBy = "customer")//,mappedBy = "customer" adui
    @JsonIgnore
    private  List<Order>orders=new ArrayList<> ();


    @ElementCollection
    @Column(name = "favourite")
    private List<RestaurantDto>favourites=new ArrayList<> ();

    @Column(name = "address")
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Address>address=new ArrayList<> ();





}
