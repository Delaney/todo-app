package com.delaney.firstrest.user;

import java.util.HashSet;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column
    private String password;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private Set<Task> tasks = new HashSet<>();

    public User(String name, String email, String password) {
        this.name = name;
        this.emai = emai;
        this.password = password;
    }
}
