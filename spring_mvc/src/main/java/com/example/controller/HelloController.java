package com.example.controller;

import com.example.domian.Account;
import com.example.domian.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class HelloController {

    // @RequestMapping(path="/hello", params = {"!username"}, headers = {"content-type=text/*"})
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/params_obj")
    public String paramsObj(Account account) {
        System.out.println(account);
        return "hello";
    }

    @RequestMapping("/params_collection")
    public String paramsCollection(User user) {
        System.out.println(user);
        return "hello";
    }

    @RequestMapping("/params_date")
    public String paramsDate(User user) {
        System.out.println(user);
        return "hello";
    }

    @RequestMapping("/date")
    public String date(@DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        System.out.println(date);
        return "hello";
    }
}
