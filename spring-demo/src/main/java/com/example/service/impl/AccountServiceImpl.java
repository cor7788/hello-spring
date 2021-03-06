package com.example.service.impl;

import com.example.dao.AccountDao;
import com.example.domain.Account;
import com.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public void transfer(Integer src, Integer target, Double money) {
        Account srcAccount = accountDao.findById(src);
        Account targetAccount = accountDao.findById(target);
        srcAccount.setMoney(srcAccount.getMoney() - money);
        targetAccount.setMoney(targetAccount.getMoney() + money);
        accountDao.updateMoneyById(srcAccount);
        int i = 1 / 0;
        accountDao.updateMoneyById(targetAccount);
    }
}
