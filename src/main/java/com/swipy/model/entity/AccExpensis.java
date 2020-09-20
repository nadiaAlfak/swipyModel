package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Setter
@Getter
public class AccExpensis {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name ="user_id",referencedColumnName = "id",nullable = false)
    private User user;
    @Column(nullable = false)
    private String type;
    @Column(nullable = false)
    private double price;
    private String description;

    public AccExpensis() {
    }

    public AccExpensis(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }
}