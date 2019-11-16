package com.example.service.impl;

import com.example.service.UserService;

import java.util.*;

public class UserServiceImpl implements UserService {

    private String[] arr;
    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;
    private Properties props;

    @Override
    public void saveUser() {
        System.out.println("用户保存成功");
        System.out.println(Arrays.toString(arr));
        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
        System.out.println(props);
    }

    public void init() {
        System.out.println("UserServiceImpl - init");
    }

    public void destroy() {
        System.out.println("UserServiceImpl - destroy");
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProps(Properties props) {
        this.props = props;
    }
}
