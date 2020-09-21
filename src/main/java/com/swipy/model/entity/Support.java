package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Support {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name ="caller_id",referencedColumnName = "id",nullable = false)
    private User caller;
    @ManyToOne
    @JoinColumn(name ="assistant_id",referencedColumnName = "id",nullable = false)
    private User assistant;
    private String description;
}