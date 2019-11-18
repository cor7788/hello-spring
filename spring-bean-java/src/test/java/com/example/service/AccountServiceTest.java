package com.example.service;

import com.example.config.ServiceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ServiceConfig.class)
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

    @Test
    public void testTransfer() {
        accountService.transfer(1, 2, 10.0);
    }
}
