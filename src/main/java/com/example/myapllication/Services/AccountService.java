package com.example.myapllication.Services;

import com.example.myapllication.DTO.LoginDTO;
import com.example.myapllication.Model.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;
import java.util.Map;

public interface AccountService {
    public Account saveAccount(Account account);
    public ResponseEntity<Account> getAccountbyID(@PathVariable Long id);
    public ResponseEntity<Account> updateAccount(@PathVariable Long id, @RequestBody Account accountDetails);
    public ResponseEntity<Map<String, Boolean>> DeleteAccount(@PathVariable Long id) ;
    public List<Account> getAllAccounts();
    public Account login(@RequestBody LoginDTO loginDTO);
}
