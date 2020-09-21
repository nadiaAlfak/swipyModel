package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "product", referencedColumnName = "id", nullable = false)
    private Product product;
    @ManyToOne
    @JoinColumn(name = "address_send_id", referencedColumnName = "id", nullable = false)
    private Address addressSend;
    @ManyToOne
    @JoinColumn(name ="address_recieve_id",referencedColumnName = "id",nullable = false)
    private Address addressRecive;
    @ManyToOne
    @JoinColumn(name ="sender_id",referencedColumnName = "id",nullable = false)
    private User sender;
    @ManyToOne
    @JoinColumn(name ="reciver_id",referencedColumnName = "id",nullable = false)
    private User userReciver;
    @Column(length =30,nullable = false )
    private String company;
    @Column(length = 200,nullable = false)
    private String trakingNumber;
    private Date anounce;
    private Date startDate;
    private Date reciveDate;
    private Date actualReciveDate;
    @Column(length = 200,nullable = false)
    private String reciver;
    private String description;
    @OneToMany(targetEntity = OrderDetails.class, mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderDetails> orderDetails;


    public Post(String company, String trakingNumber, Date anounce,
                Date startDate, Date reciveDate, Date actualReciveDate,
                String reciver, String description) {
        this.company = company;
        this.trakingNumber = trakingNumber;
        this.anounce = anounce;
        this.startDate = startDate;
        this.reciveDate = reciveDate;
        this.actualReciveDate = actualReciveDate;
        this.reciver = reciver;
        this.description = description;
    }

    public Post() {
    }
}
