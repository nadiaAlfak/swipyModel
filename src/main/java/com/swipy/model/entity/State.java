package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
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

    public State(String name) {
        this.name = name;
    }

    public State() {
    }

}
