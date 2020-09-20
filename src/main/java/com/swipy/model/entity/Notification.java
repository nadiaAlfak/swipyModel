package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(length = 10,nullable = false)
    private String type;
    @Column(nullable = false)
    private String body;
    @Column(length = 300,nullable = false)
    private String reciver;
    @ManyToOne
    @JoinColumn(name ="user_id",referencedColumnName = "id",nullable = false)
    private User user;
    private Date date;

    public Notification(String type, String body, String reciver, Date date) {
        this.type = type;
        this.body = body;
        this.reciver = reciver;
        this.date = date;
    }

    public Notification() {
    }
}
