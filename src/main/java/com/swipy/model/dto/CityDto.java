package com.swipy.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Setter
@Getter
public class CityDto {
    private UUID id;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private Date dateOfBirth;
    private String occupation;
    private String phone;
    private String type;
}