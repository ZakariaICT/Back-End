package com.example.myapllication.Repository;

import com.example.myapllication.Model.FavouriteCoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavouriteRepository extends JpaRepository<FavouriteCoin, Long> {

    List<FavouriteCoin> findAllByUserIDAndCoinID(String userID, Long coinID);
    void deleteByUserIDAndCoinID(String userID, Long coinID);
    List<FavouriteCoin> findAllByUserID(String userID);
    void deleteAllByCoinID(Long coinID);


}
