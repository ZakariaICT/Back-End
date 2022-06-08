package com.example.myapllication.Repository;

import com.example.myapllication.Model.Coin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoinRepository extends JpaRepository<Coin, Long> {
    Coin findByCoinID(Long coinID);
}
