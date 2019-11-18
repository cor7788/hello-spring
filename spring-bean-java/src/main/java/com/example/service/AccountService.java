package com.example.service;

public interface AccountService {
    void saveAccount();
    void deleteAccount();
    void transfer(Integer src, Integer target, Double money);
}
