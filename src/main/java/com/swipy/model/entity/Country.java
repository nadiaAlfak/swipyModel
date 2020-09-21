package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(length = 100,nullable = false )
    private String name;
    @OneToMany(targetEntity = State.class, mappedBy = "country", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<State> states;

    public Country() { }

    public Country(String name) {
        this.name = name;
    }
}