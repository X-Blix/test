package com.test.demo.pojo;

import lombok.Data;

/**
 * t_user表使用了lombok的插件，而导致序列化出现错误
 */
@Data
public class TUser {
    private static final long serialVersionUID = 1L;

    public TUser() {
    }

    /**
     * ID序号
     */
    private Integer id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 性别0男1女
     */
    private String gender;
    /**
     * 年龄
     */
    private Integer age;


    private String email;

}
