package com.swipy.model.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Setter
@Getter
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    private User user;
    private int orderNumber;
    @ManyToOne
    @JoinColumn(name = "product",referencedColumnName = "id",nullable = false)
    private Product product;
    @ManyToOne
    @JoinColumn(name = "reserve",referencedColumnName = "id",nullable = false)
    private Reserve reserve;
    @ManyToOne
    @JoinColumn(name = "payment",referencedColumnName = "id",nullable = false)
    private Payment payment;
    @Column(nullable = false)
    private double unitPrice;
    @Column(nullable = false)
    private double totalPrice;
    @ManyToOne
    @JoinColumn(name = "post",referencedColumnName = "id",nullable = false)
    private Post post;
    @ManyToOne
    @JoinColumn(name = "address",referencedColumnName = "id",nullable = false)
    private Address address;
    @ManyToOne
    @JoinColumn(name = "insurance",referencedColumnName = "id",nullable = false)
    private Insurance insurance;
    @Column(nullable = false)
    private Date invoice;
    private String description;

    public OrderDetails(int orderNumber, double unitPrice, double totalPrice, Date invoice, String description) {
        this.orderNumber = orderNumber;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.invoice = invoice;
        this.description = description;
    }



    public OrderDetails() {
    }
}
