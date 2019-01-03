package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Gz
 * @Date: 2018/12/30 20:53
 */
@SpringBootApplication
@EnableEurekaServer/*EurekaServer 声明为EurekaServer服务 接受其他微服务注册进来*/
public class EurekaServer7002_App {

    public static void main(String[] args){
        SpringApplication.run(EurekaServer7002_App.class, args);
    }
}
