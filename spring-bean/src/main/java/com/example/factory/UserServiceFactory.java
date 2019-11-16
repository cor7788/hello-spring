package com.example.factory;

import com.example.service.UserService;
import com.example.service.impl.UserServiceImpl;

public class UserServiceFactory {

    public UserService getUserService() {
        return new UserServiceImpl();
    }

    public static UserService getUserServiceStatic() {
        return new UserServiceImpl();
    }
}
