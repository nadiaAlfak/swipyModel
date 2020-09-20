package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "state_id",referencedColumnName = "id",nullable = false)
    private State state;
    @Column(length = 100,nullable = false)
    private String name;
    public City(String name) {
        this.name = name;
    }
    @OneToMany(targetEntity = Address.class, mappedBy = "city", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Address> addresses;

    public City() {
    }


}
