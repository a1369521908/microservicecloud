package com.atguigu.ribbonrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Gz
 * @Date: 2019/1/2 14:51
 */
@Configuration
public class MyRibbonRule {

    @Bean
    public IRule myRule(){
        return new Rule_My();
    }
}
