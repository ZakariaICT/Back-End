package com.example.myapllication.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Accountviewmodel {

    public long id;
    public String firstName;
    public String lastName;
    public String emailID;
    public String password;
    public int phoneNumber;
    public int age;
    public boolean logged;
}
