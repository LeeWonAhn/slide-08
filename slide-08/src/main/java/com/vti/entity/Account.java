package com.vti.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "account")
public class Account {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username", nullable = false, length = 50, unique = true, updatable = false)
    private String username;

    @JoinColumn(name = "department_id", referencedColumnName = "id")
    @ManyToOne
    private Department department;

}
