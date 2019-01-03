package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * @Author: Gz
 * @Date: 2018/12/30 17:48
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后自动注册进声明的地址(服务中心)
@EnableDiscoveryClient//启用服务发现
public class DeptProvider8003_App {

    public static void main(String[] args){
        SpringApplication.run(DeptProvider8003_App.class, args);
    }
}
