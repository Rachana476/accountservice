package com.example.demo.repo;

import com.example.demo.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<Account,Integer> {
}
