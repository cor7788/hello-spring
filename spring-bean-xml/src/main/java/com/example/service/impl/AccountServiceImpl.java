package com.example.service.impl;

import com.example.service.AccountService;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Override
    public void saveAccount() {
        System.out.println("保存账户信息...");
    }

    @Override
    public void deleteAccount() {
        System.out.println("删除账户信息...");
    }
}
