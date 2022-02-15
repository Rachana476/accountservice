package com.example.demo.controller;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class AccountController {
    @Autowired
    AccountService accountService;


   @GetMapping("/getaccount")
    public List<Account> getAccounts(){
        return accountService.getaccount();
    }

    @PostMapping("/createBook")
    public void createAccounts(Account account){
       accountService.createAccounts(account);
    }

}
