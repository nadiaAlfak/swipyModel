package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(length = 100,nullable = false)
    private String name;
    @OneToMany(targetEntity = SubCategory.class, mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SubCategory> subCategories;

    public Category(String name) {
        this.name = name;
    }

    public Category() {
    }

}
