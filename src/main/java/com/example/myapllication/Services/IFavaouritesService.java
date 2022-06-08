package com.example.myapllication.Services;

import com.example.myapllication.Model.CoinViewModel;
import com.example.myapllication.Model.FavouriteCoin;

import java.util.List;

public interface IFavaouritesService {


    Boolean checkIfCoinIsFavourite(String userID, Long coinID);

    Boolean deleteFavouriteCoin(String userID, Long coinID);

    FavouriteCoin saveFavouriteCoin(Long userID, Long coinID);

    List<CoinViewModel> getAllFavourite(String userID);

}
