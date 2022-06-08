package com.example.myapllication.Services;

import com.example.myapllication.DTO.LoginDTO;
import com.example.myapllication.Exception.ResourceNotFoundException;
import com.example.myapllication.Model.Account;
import com.example.myapllication.Model.Accountviewmodel;
import com.example.myapllication.Repository.AccountRepository;
import com.example.myapllication.helper.AccountConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account saveAccount(Account account) {

        return accountRepository.save(account);
    }

    @Override
    public ResponseEntity<Account> getAccountbyID(Long id) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Account not exists with id: " + id));
        return ResponseEntity.ok(account);
    }

    public List<Account> getAllAccounts()
    {

        return accountRepository.findAll();
    }

    @Override
    public Accountviewmodel login(String emailID)
    {
        Account account = accountRepository.findByemailID(emailID);
        Accountviewmodel vm = new Accountviewmodel();
        if(account == null){
            vm.setLogged(false);
            return vm;
        }
        vm = AccountConvertor.convertAccountToViewModel(account);
        vm.setLogged(true);
        return vm;
    }

    /*@Override
    public Account login(LoginDTO loginDTO) {
        String loggedin = "User logged in";
        String loginFailed =  "User login failed";
        // validation
        // verify use exist with given email and password
        Account account = accountRepository.findOneByEmailIdIgnoreCaseAndPassword(loginDTO.getEmailId(), loginDTO.getPassword());
        // response
        return  account;
    }*/


    @Override
    public ResponseEntity<Account> updateAccount(@PathVariable Long id, @RequestBody Account accountDetails) {

        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Account not exists with id: " + id));

        account.setFirstName(accountDetails.getFirstName());
        account.setLastName(accountDetails.getLastName());
        account.setEmailID(accountDetails.getEmailID());
        account.setPassword(accountDetails.getPassword());
        account.setPhoneNumber(accountDetails.getPhoneNumber());
        account.setAge(accountDetails.getAge());

        Account updatedAccount = accountRepository.save(account);
        return ResponseEntity.ok(updatedAccount);
    }

    @Override
    public ResponseEntity<Map<String, Boolean>> DeleteAccount(@PathVariable Long id) {

        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Account not exists with id: " + id));
        accountRepository.delete(account);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return  ResponseEntity.ok(response);
    }
}
