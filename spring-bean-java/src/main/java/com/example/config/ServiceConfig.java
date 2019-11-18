package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"com.example.service", "com.example.util", "com.example.dao"})
@Import(TransactionConfig.class)
// 开启AOP注解
@EnableAspectJAutoProxy
public class ServiceConfig {}
