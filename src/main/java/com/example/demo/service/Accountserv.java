package com.example.demo.service;

mport com.account_service.Entity.Account;

import com.example.demo.model.Account;

import java.util.List;

public interface AccountServ {
    public List<Account> getAllAccount();

    public Account addAccount(Account account);
    public Account findById(Integer id);
}

