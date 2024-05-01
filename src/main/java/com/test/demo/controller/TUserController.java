package com.test.demo.controller;

import com.test.demo.pojo.TUser;
import com.test.demo.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class TUserController{
    @Autowired
    TUserService tUserService;

    /**
     * 获取全部学生数据接口
     * @return List<Student>
     */
    @GetMapping(value = "/userBean",produces = {"application/json;charset=UTF-8"})
    public List<TUser> listStudentInfo(){
        return tUserService.getAllBeanInfo();
    }

    /**
     * 根据 id 查询一条 Student 数据接口
     * @param id
     * @return Student
     */
    @GetMapping(value = "/info/{id}",produces = {"application/json;charset=UTF-8"})
    public TUser studentInfoById(@PathVariable(value = "id")Integer id){
        return tUserService.selectTUserById(id);
    }

    /**
     * 新增一条 Student 数据
     * @param tUser
     */
    @PostMapping(value = "/add",produces = {"application/json;charset=UTF-8"})
    public void addStudent(@RequestBody TUser tUser){
        tUserService.insertTUser(tUser);
    }

    /**
     * 删除一条 Student 数据
     * @param id
     */
    @PostMapping(value = "/remove/{id}",produces = {"application/json;charset=UTF-8"})
    public void removeStudent(@PathVariable("id") Integer id){
        tUserService.deleteTuserById(id);
    }

    /**
     * 修改一条 Student 数据
     * @param tUser
     */
    @PostMapping(value = "/edit",produces = {"application/json;charset=UTF-8"})
    public void editStudent(@RequestBody TUser tUser){
        tUserService.updateTUser(tUser);
    }
}
