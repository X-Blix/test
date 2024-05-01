package com.test.demo.mapper;

import com.test.demo.pojo.TUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * TUser的Dao层
 * 加入Mapper注解后,Mybatis的拦截器会把其的接口生成动态代理类,让spring对mapper接口的bean进行管理,
 * 也可通过注解将需要使用的sql写在这
 */
@Mapper
public interface TUserMapper {
    //根据实体bean返回集合
    List<TUser> getAllBeanInfo();

    TUser selectTUserById(Integer id);

    int insertTUser(TUser tUser);

    int deleteTuserById(Integer id);

    int updateTUser(TUser tUser);


}
