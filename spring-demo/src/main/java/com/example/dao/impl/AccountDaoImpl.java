package com.example.dao.impl;

import com.example.dao.AccountDao;
import com.example.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Account> findAll() {
        String sql = "select * from account";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Account.class));
    }

    @Override
    public Account findById(Integer id) {
        String sql = "select * from account where id = ?";
        List<Account> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Account.class), id);
        if (list == null || list.size() == 0) {
            return null;
        }
        if (list.size() > 1) {
            throw new RuntimeException("Account 查询结果不唯一");
        }
        return list.get(0);
    }

    @Override
    public void updateMoneyById(Account account) {
        String sql = "update account set money = ? where id = ?";
        jdbcTemplate.update(sql, account.getMoney(), account.getId());
    }
}
