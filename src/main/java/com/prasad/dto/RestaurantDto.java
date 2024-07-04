package com.prasad.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity@NoArgsConstructor@AllArgsConstructor
@Table(name = "favouritea")
@Embeddable

public class RestaurantDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "images" ,length = 1000)
    private List<String>images;

    @Column(name = "discription")
    private String description;
}
