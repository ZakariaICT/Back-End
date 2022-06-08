package com.example.myapllication.Services;

import com.example.myapllication.Model.Account;
import com.example.myapllication.Model.Coin;

import java.util.List;

public interface ICoinServices {

    public Coin createCoin(Coin coin);

    public List<Coin> getAllCoins();


}
