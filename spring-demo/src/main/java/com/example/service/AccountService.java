package com.example.service;

import com.example.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    void transfer(Integer src, Integer target, Double money);
}
