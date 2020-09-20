package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
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
    @OneToMany(targetEntity = OrderDetails.class, mappedBy = "address", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderDetails> orderDetails;
    @OneToMany(targetEntity = Post.class, mappedBy = "address", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Post> addressRecive;
    @OneToMany(targetEntity = Post.class, mappedBy = "address", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Post> addressSend;







    public Address() { }

    public Address(int postalCode, int houseNumber, String description) {
        this.postalCode = postalCode;
        this.houseNumber = houseNumber;
        this.description = description;
    }

    private String description;
    @ManyToOne
    @JoinColumn(name = "address_type_id",referencedColumnName = "id",nullable = false)
    private AddressType addressType;

}

