package com.test.demo.service.impl;

import com.test.demo.mapper.TUserMapper;
import com.test.demo.pojo.TUser;
import com.test.demo.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class  TUserServiceImpl implements TUserService {

    /**
     * Autowired是当Spring发现该注解时，将动在代码上下文中找到与其匹配（默认是类型匹配）的Bean，并自动注入到相应的地方去。简称自动注入.
     */
    @Autowired
    TUserMapper tuserMapper;


    @Override
    public List<TUser> getAllBeanInfo() {
        return tuserMapper.getAllBeanInfo();
    }

    @Override
    public TUser selectTUserById(Integer id) {
        return tuserMapper.selectTUserById(id);
    }

    @Override
    public int insertTUser(TUser tuser) {
        return tuserMapper.insertTUser(tuser);
    }

    @Override
    public int deleteTuserById(Integer id) {
        return tuserMapper.deleteTuserById(id);
    }

    @Override
    public int updateTUser(TUser tUser) {
        return tuserMapper.updateTUser(tUser);
    }




}
