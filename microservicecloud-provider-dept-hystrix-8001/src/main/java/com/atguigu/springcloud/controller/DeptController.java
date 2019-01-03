package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Gz
 * @Date: 2018/12/30 17:38
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix_GET")
    public Dept get(@PathVariable Long id){
//        return deptService.get(id);
        Dept dept = deptService.get(id);
        if (null == dept){
            throw  new RuntimeException("该ID: "+id +"没有对应的信息,null---@HystrixCommand");
        }
        return dept;
    }

    public Dept processHystrix_GET(@PathVariable Long id){
        return new Dept().setDname("该ID: "+id +"没有对应的信息,null---@HystrixCommand")
                .setDb_source("no this data in database");
    }

    @GetMapping(value = "/dept/list")
    public List<Dept> list(){
        return deptService.list();
    }

    @GetMapping(value = "/dept/discovery")
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        System.out.println(list);
        List<ServiceInstance> instanceList = discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance serviceInstance:
             instanceList) {
            System.out.println(serviceInstance.getServiceId());
        }
        return this.discoveryClient;
    }
}
