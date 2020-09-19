package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Setter
@Getter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id", nullable = false)
    private City city;
    @Column(nullable = false)
    private int postalCode;
    @Column(nullable = false)
    private int houseNumber;
    private String description;
    @ManyToOne
    @JoinColumn(name = "address_type_id",referencedColumnName = "id",nullable = false)
    private AddressType addressType;


    //TODO: alaki irad nagir neveshtam

}

