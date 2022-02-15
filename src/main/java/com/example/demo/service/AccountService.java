package com.example.demo.service;



import com.example.demo.model.Account;
import com.example.demo.repo.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements AccountServ{
    @Autowired
    private Repository repository;


    @Override
    public List<Account> getAllAccount() {
        return (List<Account>) repository.findAll();
    }

    @Override
    public Account addAccount(Account account) {
        return repository.save(account);
    }
    @Override
    public Account findById(Integer id) {
        return repository.findById(id).get();
    }

    public List<Account> getAccount() {
    }

    public List<Account> getaccount() {
    }

    public void createAccounts(AccountService){
    }
}
