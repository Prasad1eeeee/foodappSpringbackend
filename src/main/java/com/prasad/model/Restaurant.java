package com.prasad.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "restaurant")
@Entity

public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @OneToOne
    private User owner;

    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "cuisineType")
    private  String cuisineType;

    @OneToOne
    private Address address;

    @OneToOne
    @JoinColumn(name = "contact_information_id") // Corrected here
    private ContactInformation contactInformation;

    @Column(name = "openingHours")
    private String openingHours;

    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Order> orders=new ArrayList<> ();

    @Column(length = 1000,name = "images")
    private List<String>images;

    @Column(name = "registrationDate")
    private LocalDateTime registrationDate;

    @Column(name = "open_close")
    private boolean open;

    @JsonIgnore
    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL)
    private List<Food>foods=new ArrayList<> ();
}
