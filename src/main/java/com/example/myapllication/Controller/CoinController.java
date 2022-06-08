package com.example.myapllication.Controller;

import com.example.myapllication.Model.Account;
import com.example.myapllication.Model.Coin;
import com.example.myapllication.Model.FavouriteCoin;
import com.example.myapllication.Services.CoinServices;
import com.example.myapllication.Services.FavouritesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("/coin")
public class CoinController {

    @Autowired
    private CoinServices coinServices;

    @Autowired
    private FavouritesService favouritesService;

    @PostMapping("/add")
    public String add(@RequestBody Coin coin){
        coinServices.createCoin(coin);
        return "New Coin is added";
    }

    //@GetMapping("/Coins")
    //public List<Coin> getAllCoins(String UserID){
    //    return favouritesService.getAllFavourite();
    //}

    @PostMapping("/Coins/{userID}&{coinID}")
    public FavouriteCoin saveFavouriteCoin(@PathVariable Long userID, @PathVariable Long coinID)
    {
        return favouritesService.saveFavouriteCoin(userID, coinID);
    }

    @GetMapping("/Coins")
    public List<Coin> getAllCoins()
    {
        return coinServices.getAllCoins();
    }

}
