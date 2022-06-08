package com.example.myapllication.helper;

import com.example.myapllication.Model.Account;
import com.example.myapllication.Model.Accountviewmodel;

public class AccountConvertor {
    public static Accountviewmodel convertAccountToViewModel(Account account)
    {
        Accountviewmodel vm = new Accountviewmodel();
        vm.setId((account.getId()));
        vm.setFirstName(account.getFirstName());
        vm.setLastName(account.getLastName());
        vm.setEmailID(account.getEmailID());
        vm.setPassword(account.getPassword());
        vm.setPhoneNumber(account.getPhoneNumber());
        vm.setAge(account.getAge());
        return vm;
    }
}
