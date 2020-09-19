package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Insurance {
    @Id
    @GeneratedValue(strategy = @GeneratedValue)
    private UUID id;

}
