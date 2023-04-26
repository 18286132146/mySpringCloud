package com.miguan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;



@SpringBootApplication
public class provider_product_8001 {
    public static void main(String[] args) {
        SpringApplication.run(provider_product_8001.class,args);
    }
}
