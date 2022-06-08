package com.example.myapllication.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "favouriteCoin")
public class FavouriteCoin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long favouriteID;

    @Column(name = "userID")
    private Long userID;

    @Column(name = "coinID")
    private Long coinID;
}
