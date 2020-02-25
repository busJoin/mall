package com.chang.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * @create 2020-02-24 21:36
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.chang.mall.mapper","com.chang.mall.dao"})
public class MyBatisConfig {
}
