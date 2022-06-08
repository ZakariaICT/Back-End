package com.example.myapllication.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "Accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id")
    private String emailID;

    @Column(name = "password")
    private String password;

    @Column(name = "PhoneNumber")
    private Integer phoneNumber;

    @Column(name = "Age")
    private Integer age;

    //@OneToMany(targetEntity = Favourites.class,cascade = CascadeType.ALL)
    //@JoinColumn(name = "ac_fk",referencedColumnName = "id")
    //private List<Favourites> favourites;


}

