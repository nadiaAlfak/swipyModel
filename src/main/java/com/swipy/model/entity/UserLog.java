package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Setter
@Getter
public class UserLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name ="user_id",referencedColumnName = "id",nullable = false)
    private User user;
    @ManyToOne
    @JoinColumn(name ="log_activity_id",referencedColumnName = "id",nullable = false)
    private LogActivityType logActivityType;
    private Date date;
    private Date time;
    private String description;


}
