package com.prasad.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "foodCategory")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Catagory {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Id;

    @Column(name = "nane")
    private String name;

    @ManyToOne
    @JsonIgnore
    private Restaurant restaurant;

}
