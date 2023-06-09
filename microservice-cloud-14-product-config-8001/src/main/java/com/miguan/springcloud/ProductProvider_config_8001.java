package com.miguan.springcloud;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@MapperScan("com.miguan.springcloud.mapper")
@EnableEurekaClient
@SpringBootApplication
public class ProductProvider_config_8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_config_8001.class,args);
    }
}
