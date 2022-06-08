package com.example.myapllication.Repository;

import com.example.myapllication.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
   // Account findOneByEmailIdIgnoreCaseAndPassword(String email, String password);
    public Account findByemailID(String emailID);
}
