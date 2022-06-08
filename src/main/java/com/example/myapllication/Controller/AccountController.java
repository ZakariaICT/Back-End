package com.example.myapllication.Controller;

import com.example.myapllication.DTO.LoginDTO;
import com.example.myapllication.Exception.ResourceNotFoundException;
import com.example.myapllication.Model.Account;
import com.example.myapllication.Model.Accountviewmodel;
import com.example.myapllication.Repository.AccountRepository;
import com.example.myapllication.Services.AccountService;
import com.example.myapllication.Services.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountServiceImpl accountService;

    @PostMapping("/add")
    public String add(@RequestBody Account account){
        accountService.saveAccount(account);
        return "New Account is added";
    }

    // get employee by id rest API
    @GetMapping("/accounts/{id}")
    public ResponseEntity<Account>  getAccountbyID(@PathVariable Long id){
        ResponseEntity<Account> account = accountService.getAccountbyID(id);
        return account;
    }

    //get all Accounts
    @GetMapping("/accounts")
    public List<Account> getAllAccounts(){
        return  accountService.getAllAccounts();
    }

    // update employee rest API
    @PutMapping("/accounts/{id}")
    public ResponseEntity<Account> updateAccount(@PathVariable Long id, @RequestBody Account accountDetails){
        ResponseEntity<Account> updatedAccount = accountService.updateAccount(id, accountDetails);
        return updatedAccount;
    }

    // delete account rest api
    @DeleteMapping("/accounts/{id}")
    public ResponseEntity<Map<String, Boolean>> DeleteAccount(@PathVariable Long id){
        accountService.DeleteAccount(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/email/{emailID}")
    public Accountviewmodel Login(@PathVariable String emailID)
    {
        return accountService.login(emailID);
    }

    // Login
    /*@PostMapping("/login")
    public ResponseEntity<Account> login(@RequestBody LoginDTO loginDTO)
    {
        Account account = accountService.login(loginDTO);
        return ResponseEntity.ok(account);
    }*/

}

