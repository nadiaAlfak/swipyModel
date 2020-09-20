package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Setter
@Getter
public class Reserve {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false)
    private Date startDate;
    @Column(nullable = false)
    private Date endDate;
    @ManyToOne
    @JoinColumn(name = "product_id",referencedColumnName = "id",nullable = false)
    private Product product;
    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id",nullable = false)
    private User user;
    @Column(length = 50)
    private String status;
    @Column(length = 50)
    private String peymentStatus;


    public Reserve(Date startDate, Date endDate, String status, String peymentStatus) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.peymentStatus = peymentStatus;
    }


    public Reserve() {
    }

}
