package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan(basePackages = {"com.example.soundsystem"})
@PropertySource(value = "classpath:app.properties", encoding = "utf-8")
public class CDPlayerConfig {

}
