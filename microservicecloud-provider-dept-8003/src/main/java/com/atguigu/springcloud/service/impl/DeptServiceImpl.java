package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.DeptDao;
import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Gz
 * @Date: 2018/12/30 17:33
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    public List<Dept> list() {
        return deptDao.findAll();
    }
}
