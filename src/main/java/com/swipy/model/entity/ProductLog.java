package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
public class ProductLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name ="product_id",referencedColumnName = "id",nullable = false)
    private Product product;
    @ManyToOne
    @JoinColumn(name ="log_activity_id",referencedColumnName = "id",nullable = false)
    private LogActivityType logActivityType;
    private Date date;
    private Date time;
    private String description;


}
