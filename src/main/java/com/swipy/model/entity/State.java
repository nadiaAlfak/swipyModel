package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "country_id",referencedColumnName = "id",nullable = false)
    private Country country;

    @Column(length = 100,nullable = false)
    private String name;
    @OneToMany(targetEntity = City.class, mappedBy = "state", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<City> cities;

    public State(String name) {
        this.name = name;
    }

    public State() {
    }

}
