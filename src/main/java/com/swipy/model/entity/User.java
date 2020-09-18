package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private boolean status;
    private String firstName;
    private String lastName;
    private int gender;
    private String email;
    private Date dateOfBirth;
    private String occupation;
    private  String phone;
    private int type;

    public User() {
    }

    public User(boolean status, String firstName, String lastName,
                int gender, String email, Date dateOfBirth, String occupation,
                String phone, int type, String password) {


        this.status = status;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.occupation = occupation;
        this.phone = phone;
        this.type = type;
        this.password = password;
    }

    private String password;




}
