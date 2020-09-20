package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
public class LogActivityType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(length = 50, nullable = false)
    private String name;
    @OneToMany(targetEntity = UserLog.class, mappedBy = "log_activity_type", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<UserLog> userLogs;
    @OneToMany(targetEntity = ProductLog.class, mappedBy = "log_activity_type", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ProductLog> productLogs;


    public LogActivityType(String name) {
        this.name = name;
    }

    public LogActivityType() {
    }
}

