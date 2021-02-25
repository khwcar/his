package com.toomuchwork.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.toomuchwork.entity.User;
import com.toomuchwork.service.Impl.UserServiceImpl;
import com.toomuchwork.util.APIResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2020/12/21  14:08
 */
@RestController
@Slf4j
@RequestMapping("UserController")
public class UserController {
    @Resource
    UserServiceImpl userService;
    @GetMapping("/selectByPrimaryKey")
    public APIResult selectByPrimaryKey(Integer userid) {
        log.info("接收参数：{}", userid);
        long times = System.currentTimeMillis();
        System.out.println("传入参数为："+userid);
        User user = userService.selectByPrimaryKey(userid);
        APIResult result;
        if (user == null) {
            result = new APIResult("失败", "4444", null);
            log.info("查询结果失败，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - times);
            return result;
        } else {
            result = new APIResult("成功", "0000", user);
            log.info("查询结果成功，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - times);
            return result;
        }
    }
    @GetMapping("/selectByUserTest")
    public APIResult  selectByUserTest(Integer[] userid){
        log.info("接收参数：{}", userid);
        long times = System.currentTimeMillis();
        System.out.println("传入参数为："+userid);
        PageHelper.startPage(1,2,true);
        List<User> user = userService.selectByUserTest(userid);
        PageInfo<User> pageInfo = new PageInfo<>(user);
        APIResult result;
        if (user == null) {
            result = new APIResult("失败", "4444", null);
            log.info("查询结果失败，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - times);
            return result;
        } else {
            result = new APIResult("成功", "0000", pageInfo);
            log.info("查询结果成功，返回结果:{}，耗时：【{}】毫秒", JSON.toJSONString(result), System.currentTimeMillis() - times);
            return result;
        }
    }
}
