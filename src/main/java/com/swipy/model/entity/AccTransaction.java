package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class AccTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

}
