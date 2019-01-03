package com.atguigu.springcloud;

import com.atguigu.ribbonrule.MyRibbonRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author: Gz
 * @Date: 2018/12/30 18:36
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MyRibbonRule.class)
public class DeptConsumer80_App {

    public static void main(String[] args){
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}
