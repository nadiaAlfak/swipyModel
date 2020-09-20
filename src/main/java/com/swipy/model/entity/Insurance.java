package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name ="product_id",referencedColumnName = "id",nullable = false)
    private Product product;
    @Column(nullable = false)
    private double price;
    @Column(nullable = false)
    private String description;

    public Insurance(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public Insurance() {
    }
}
