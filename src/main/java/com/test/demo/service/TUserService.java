package com.test.demo.service;

import com.test.demo.mapper.TUserMapper;
import com.test.demo.pojo.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TUser逻辑层
 * Service注解是声明这个类是业务层,用来写复杂逻辑的
 */

public interface TUserService {
    //根据实体bean返回集合
    List<TUser> getAllBeanInfo();

    TUser selectTUserById(Integer id);

    int insertTUser(TUser tUser);

    int deleteTuserById(Integer id);

    int updateTUser(TUser tUser);
}
