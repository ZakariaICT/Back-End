package com.example.myapllication.Services;

import com.example.myapllication.Model.Account;
import com.example.myapllication.Model.Coin;
import com.example.myapllication.Repository.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoinServices implements ICoinServices {

    @Autowired
    private CoinRepository coinRepository;

    @Override
    public Coin createCoin(Coin coin) {
        return coinRepository.save(coin);
    }

    @Override
    public List<Coin> getAllCoins() {
        return coinRepository.findAll();
    }
}
