package com.example.controller;

import com.example.domian.Account;
import com.example.domian.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

@Controller
@SessionAttributes("user")
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

    @RequestMapping("/param")
    public String param(@RequestParam(defaultValue = "root") String username) {
        System.out.println(username);
        return "hello";
    }

    @RequestMapping("/request_body")
    public String requestBody(@RequestBody String body) {
        System.out.println(body);
        return "hello";
    }

    @RequestMapping("/hello/{id}")
    public String pathVariable(@PathVariable String id) {
        System.out.println(id);
        return "hello";
    }

    @RequestMapping("/request_header")
    public String requestHeader(@RequestHeader("accept") String accept) {
        System.out.println(accept);
        return "hello";
    }

    @RequestMapping("/cookie_value")
    public String cookieValue(@CookieValue("JSESSIONID") String id) {
        System.out.println(id);
        return "hello";
    }

    @RequestMapping("/model_attribute")
    public String modelAttribute(User user, @ModelAttribute("acc") Account account, Model model) {
        Map<String, Object> map = model.asMap();
        for(String key: map.keySet()) {
            Object value = map.get(key);
            System.out.println(key + "---" + value);
        }
        return "hello";
    }

    @ModelAttribute
    public User completeUser(String name) {
        // 模拟根据 name 从数据库查询 user 数据。
        User user = new User();
        user.setBirthday(new Date());
        System.out.println("注解 @ModelAttribute 修饰的方法的方法执行了");
        return user;
    }

    @ModelAttribute
    public void completeAccount(String username, Map<String, Account> map) {
        Account account = new Account();
        account.setPassword("123456");
        map.put("acc", account);
    }

    @RequestMapping("/empty_session_attribute")
    public String emptySessionAttribute(SessionStatus status) {
        status.setComplete();
        return "hello";
    }


}
