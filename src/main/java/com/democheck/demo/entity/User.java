package com.democheck.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String mobile;
    private String kycStatus;
    private String nationality;
    private Integer age;
    @OneToOne(mappedBy = "user",
    cascade = CascadeType.ALL)
    private Wallet wallet;
}
