package com.example.dao;

import com.example.domain.Account;

import java.util.List;

public interface AccountDao {
    List<Account> findAll();
    Account findById(Integer id);
    void updateMoneyById(Account account);
}
