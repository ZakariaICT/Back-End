package com.example.myapllication.DTO;

import com.example.myapllication.Model.Account;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FavouritesRequest {

    private Account account;
}
