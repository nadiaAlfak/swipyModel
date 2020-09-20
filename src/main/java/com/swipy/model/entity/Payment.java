package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Setter
@Getter
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(length = 20,nullable = false)
    private String curdType;

    public Payment() {
    }

    public Payment(String curdType) {
        this.curdType = curdType;
    }

}

