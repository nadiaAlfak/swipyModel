package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Setter
@Getter
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "product_id",referencedColumnName = "id",nullable = false)
    private Product product;
    @Column(length = 10,nullable = false)
    private String format;
    private boolean isPrimery;
    @Column(length = 10,nullable = false)
    private String mediaType;


    public Media(String format, String address, boolean isprimery,String mediaType) {
        this.format = format;
        this.address = address;
        this.isPrimery = isprimery;
        this.mediaType = mediaType;
    }

    @Column(length = 900,nullable = false)
    private String address;

    public Media() {
    }
}
