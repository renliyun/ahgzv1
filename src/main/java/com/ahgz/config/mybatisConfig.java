package com.ahgz.config;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.ahgz.mapper")
public class mybatisConfig {
}
