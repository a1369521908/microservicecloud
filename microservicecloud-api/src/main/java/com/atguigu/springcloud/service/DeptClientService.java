package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @Author: Gz
 * @Date: 2019/1/2 17:09
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface DeptClientService {

    @GetMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id")long id);

    @GetMapping(value = "/dept/list")
    public List<Dept> list();

    @PostMapping(value = "dept/add")//RESTful风格映射地址
    public boolean add(Dept dept);

}
