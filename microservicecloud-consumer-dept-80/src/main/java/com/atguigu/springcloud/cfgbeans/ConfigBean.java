package com.atguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Gz
 * @Date: 2018/12/30 18:21
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced   //SpringCloud Ribbon是基于Netflix Ribbon实现的一套客户端的 负载均衡工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
//        return new RandomRule();
        return new BestAvailableRule();
    }
}
