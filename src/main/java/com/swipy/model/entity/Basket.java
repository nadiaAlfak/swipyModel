package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name ="user_id",referencedColumnName = "id",nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name ="product_id",referencedColumnName = "id",nullable = false)
    private Product product;



}
