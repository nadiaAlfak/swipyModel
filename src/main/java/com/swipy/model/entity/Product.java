package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    @JoinColumn(name ="user_id",referencedColumnName = "id",nullable = false)
    private User user;
    @OneToMany(targetEntity = Media.class,mappedBy = "product",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Media> media;
    @Column(length = 150,nullable = false)
    private String size;
    @Column(nullable = false)
    private double price;
    private String description;
    @ManyToOne
    @JoinColumn(name = "sub_category_id",referencedColumnName ="id",nullable = false )
    private SubCategory subCategory;
    private String tag;
    private int aging;
    private boolean isDangerous;
    @OneToMany(targetEntity = Reserve.class, mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Reserve> reserves;
    @OneToMany(targetEntity = Basket.class, mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Basket> baskets;
    @OneToMany(targetEntity = OrderDetails.class, mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderDetails> orderDetails;
    @OneToMany(targetEntity = ProductLog.class, mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ProductLog> productLogs;
    @OneToMany(targetEntity = Insurance.class, mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Insurance> insurances;
    @OneToMany(targetEntity = Media.class, mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Media> medias ;
    @OneToMany(targetEntity = Post.class, mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Post> posts;

    public Product() {}
    public Product(String size, double price, String description, String tag, int aging, boolean isDangerous) {
        this.size = size;
        this.price = price;
        this.description = description;
        this.tag = tag;
        this.aging = aging;
        this.isDangerous = isDangerous;
    }
}