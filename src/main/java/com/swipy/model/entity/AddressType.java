package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
public class AddressType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(length = 30,nullable = false)
    private String name;

    public AddressType(String name) {
        this.name = name;
    }



    public AddressType() {
    }


}
