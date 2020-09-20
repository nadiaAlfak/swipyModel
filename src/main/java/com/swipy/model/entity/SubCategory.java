package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "category_id",referencedColumnName = "id",nullable = false)
    private Category category;
    @Column(length = 100,nullable = false)
    private String name;
    @OneToMany(targetEntity = Product.class, mappedBy = "sub_category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> products;

    public SubCategory(String name) {
        this.name = name;
    }

    public SubCategory() {
    }
}
