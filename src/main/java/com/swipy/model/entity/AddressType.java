package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
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
    @OneToMany(targetEntity = Address.class, mappedBy = "addressType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Address> addresses;

    public AddressType(String name) {
        this.name = name;
    }



    public AddressType() {
    }


}
