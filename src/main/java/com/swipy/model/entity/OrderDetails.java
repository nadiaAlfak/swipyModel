package com.swip

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Setter
@Getter
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
}
