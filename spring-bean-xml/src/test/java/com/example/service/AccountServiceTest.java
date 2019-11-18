package com.example.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-aop.xml")
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testSaveAccount() {
        accountService.saveAccount();
    }

    @Test
    public void testDeleteAccount() {
        accountService.deleteAccount();
    }
}
