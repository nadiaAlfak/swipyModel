package com.swipy.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false)
    private boolean status;
    @Column(length = 100,nullable = false)
    private String firstName;
    @Column(length = 100,nullable = false)
    private String lastName;
    @Column(nullable = false)
    private int gender;
    @Column(length = 500,nullable = false)
    private String email;
    @Column(nullable = false)
    private Date dateOfBirth;
    @Column(length = 200,nullable = true)
    private String occupation;
    @Column(length = 50,nullable = true)
    private String phone;
    private int type;
    @Column(length = 500,nullable = false)
    private String password;

    @OneToMany(targetEntity = Address.class, mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Address> addresses;
    @OneToMany(targetEntity = Product.class, mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> products;
    @OneToMany(targetEntity = Reserve.class, mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Reserve> reserves;
    @OneToMany(targetEntity = OrderDetails.class, mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderDetails> orderDetails;
    @OneToMany(targetEntity = Basket.class, mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Basket> baskets;
    @OneToMany(targetEntity = Post.class,mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Post> senders;
    @OneToMany(targetEntity = Post.class,mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Post> receivers;
    @OneToMany(targetEntity = UserLog.class,mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<UserLog> userLogs;
    @OneToMany(targetEntity = AccTransaction.class,mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<AccTransaction> accTransactions;
    @OneToMany(targetEntity = AccExpensis.class,mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<AccExpensis> accExpenses;
    @OneToMany(targetEntity = Notification.class,mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Notification> notifications;
    @OneToMany(targetEntity = Support.class,mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Support> callers;
    @OneToMany(targetEntity = Support.class,mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Support> assistants;








    public User() {}

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


}
