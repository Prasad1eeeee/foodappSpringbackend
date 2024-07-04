
package com.prasad.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "food")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id; // Corrected the variable name to start with lowercase

    @Column(name = "name")
    private String name; // Corrected the column name

    @Column(name = "description")
    private String description; // Corrected the column name

    @Column(name = "price")
    private Long price; // Corrected the column name

    @ManyToOne
    @JoinColumn(name = "food_category_id")  // Corrected here
    private Catagory foodCatagory;

    @ElementCollection
    @Column(length = 1000, name = "images")
    private List<String> images;

    @Column(name = "available")
    private boolean available;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")  // Corrected here
    private Restaurant restaurant;

    @Column(name = "veg")
    private boolean veg;

    @Column(name = "isSeasonal")
    private boolean isSeasonal;

    @ManyToMany
    @JoinTable(name = "food_ingredient_items", // Join table for ManyToMany relationship
            joinColumns = @JoinColumn(name = "food_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_item_id"))
    private List<IngredientItems> ingredientItems = new ArrayList<>();

    @Column(name = "date")
    private Date creationDate;
}
