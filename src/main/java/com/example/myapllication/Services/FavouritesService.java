package com.example.myapllication.Services;


import com.example.myapllication.Model.CoinViewModel;
import com.example.myapllication.Model.FavouriteCoin;
import com.example.myapllication.Repository.CoinRepository;
import com.example.myapllication.Repository.FavouriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class FavouritesService implements IFavaouritesService {
    @Autowired
    private FavouriteRepository favouriteRepository;

    @Autowired
    private CoinRepository coinRepository;
    @Override
    public Boolean checkIfCoinIsFavourite(String userID, Long coinID) {
        return null;
    }

    @Override
    public Boolean deleteFavouriteCoin(String userID, Long coinID) {
        return null;
    }

    @Override
    public FavouriteCoin saveFavouriteCoin(Long userID, Long coinID)
    {
        FavouriteCoin favouriteCoin = new FavouriteCoin();
        favouriteCoin.setCoinID(coinID);
        favouriteCoin.setUserID(userID);
        return favouriteRepository.save(favouriteCoin);
    }

    @Override
    public List<CoinViewModel> getAllFavourite(String userID) {
        return null;
    }

    // @Override
   // public List<CoinViewModel> getAllFavourite(String userID)
    //{
    //    List<FavouriteCoin> favouriteCoins = favouriteRepository.findAllByUserID(userID);
     //   List<Coin> coins = new ArrayList<>();
     //   List<CoinViewModel> coinViewModels = new ArrayList<>();

     //   favouriteCoins.forEach(favouriteCoin -> {
    //        coins.add(coinRepository.findByCoinID(favouriteCoin.getCoinID()));
    //    });
   // }
}
