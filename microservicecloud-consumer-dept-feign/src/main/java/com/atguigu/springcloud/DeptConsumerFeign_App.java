package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: Gz
 * @Date: 2018/12/30 18:36
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.atguigu.springcloud"})
//@ComponentScan("com.atguigu.springcloud")
public class DeptConsumerFeign_App {

    public static void main(String[] args){
        SpringApplication.run(DeptConsumerFeign_App.class, args);
    }
}
