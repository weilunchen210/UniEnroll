package com.UniEnroll.UniEnroll.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
enum AccountType{
    STUDENT("Student"),
    LECTURER("Lecturer"),
    ADMIN("Admin");

    private final String type;

    AccountType(String type){
        this.type = type;
    }

}

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountID;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;
}
