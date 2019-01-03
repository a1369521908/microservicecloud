package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Gz
 * @Date: 2018/12/30 17:14
 */
@Mapper
@Repository
public interface DeptDao {

    public boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
