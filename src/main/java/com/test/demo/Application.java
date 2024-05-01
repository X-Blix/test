package com.test.demo;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * spring boot  启动
 * extends SpringBootServletInitializer 为了部署到Tomcat
 *
 * SpringBootApplication标签是Sprnig Boot项目的核心注解，目的是开启自动配置
 */

@SpringBootApplication
@MapperScan("com.test.demo.mapper")
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }


    /**
     * 用于打WAR包
     * @param builder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}




