package com.prasad.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "contactInformation")
@AllArgsConstructor
@NoArgsConstructor

public class ContactInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private  Long id;


    @Column(name = "email")
    private String email;

    @Column(name = "tel")
    private String tel;

    @Column(name = "twitter")
    private String twitter;

    @Column(name = "instagram")
    private String instagram;

}
