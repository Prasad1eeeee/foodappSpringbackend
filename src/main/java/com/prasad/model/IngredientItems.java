package com.prasad.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ingredientItems")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class IngredientItems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    private IngrediantsCategory ingrediantsCategory;

    @ManyToOne
    @JsonIgnore
    private Restaurant restaurant;

    @Column(name = "inStock")
    private boolean inStock=true;
}
