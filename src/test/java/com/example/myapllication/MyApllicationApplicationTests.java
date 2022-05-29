package com.example.myapllication;

import com.example.myapllication.Controller.AccountController;
import com.example.myapllication.Model.Account;
import com.example.myapllication.Repository.AccountRepository;
import com.example.myapllication.Services.AccountService;
import com.example.myapllication.Services.AccountServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.bind.annotation.RequestBody;

//import static javax.print.attribute.TextSyntax.verify;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class MyApllicationApplicationTests {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private AccountServiceImpl accountService;

    @Test
    public void CreateUserSerivce(){
       /* Account account = new Account();
        account.setFirstName("Test Name");

        when(accountRepository.save(ArgumentMatchers.any(Account.class))).thenReturn(account);

        Account created = accountController.add(account);

        assertThat(created.getFirstName()).isSameAs(account.getFirstName());
        verify(accountRepository).save(account); */
    }

    @Test
    void getAllAccounts() {
        Assertions.assertThat(accountService.getAllAccounts()).isNotNull();
    }


  /*  @Test
    void getAccountbyID(){
    Set<Account> accounts = new HashSet<>();
    Account account = new Account(1, "Fake", "LastName", "last@live.nl", "123456", 16458, 20);
        Mockito.when(accountRepository.getById(1l)).thenReturn(account);
        Account accountGet = accountService.getAccountbyID((1));
        Assertions.assertThat(accountGet.getId()).isEqualTo(1);
        Assertions.assertThat(accountGet.getFirstName()).isEqualTo("Fake");
        Assertions.assertThat(accountGet.getLastName()).isEqualTo("LastName");
        Assertions.assertThat(accountGet.getEmailID()).isEqualTo("last@live.n");
        Assertions.assertThat(accountGet.getPassword()).isEqualTo("123456");
        Assertions.assertThat(accountGet.getPhoneNumber()).isEqualTo(16458);
        Assertions.assertThat(accountGet.getAge()).isEqualTo(20);

    }*/

   /* @Test
    void createAccount(){
    Account account = new Account();
    account.setId(1L);
    account.setFirstName("Zakaria");
    account.setLastName("Has");
    account.setEmailID("zaka@live.nl");
    account.setPassword("jaijdms123456");
    account.setPhoneNumber(1646);
    account.setAge(21);

    Account account1 = accountService.saveAccount(account);

    Assertions.assertThat(account.getId()).isEqualTo(1L);
    Assertions.assertThat(account.getFirstName()).isEqualTo("Zakaria");

    }*/
}

