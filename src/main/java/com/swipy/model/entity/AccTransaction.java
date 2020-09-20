package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
public class AccTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name ="user_id",referencedColumnName = "id",nullable = false)
    private User user;
    @Column(nullable = false)
    private Date date;
    @Column(nullable = false)
    private Date time;
    @Column(nullable = false)
    private double price;
    private String activity;
    @Column(length = 150)
    private String transactionId;
    @ManyToOne
    @JoinColumn(name ="order_details_id",referencedColumnName = "id",nullable = false)
    private OrderDetails orderDetails;

    public AccTransaction() {
    }

    public AccTransaction(Date date, Date time, double price, String activity, String transactionId) {
        this.date = date;
        this.time = time;
        this.price = price;
        this.activity = activity;
        this.transactionId = transactionId;
    }
}
