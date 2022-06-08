package com.example.myapllication.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CoinViewModel {

    private long coinID;

    private String coinName;

    private String coinDescription;
}
