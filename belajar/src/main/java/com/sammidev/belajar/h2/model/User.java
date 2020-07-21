package com.sammidev.belajar.h2.model;

import javax.persistence.*;

@Entity
@NamedQuery(query = "select u from User u", name = "query_find_all_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name; // proper object pilihan yg bagus
    private String role; // mungkin pakai enum lebih baik
    protected User() {}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public User(String name, String role) {
        super();
        this.name = name;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}
