package com.toomuchwork.controller;

import com.toomuchwork.entity.pojo.LoginUser;
import com.toomuchwork.service.LoginService;
import com.toomuchwork.util.APIResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: 登录
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2021/1/5  15:09
 */
@Slf4j
@RestController
@RequestMapping("LoginController")
public class LoginController {
    @Autowired
    LoginService loginService;
    @PostMapping("/loginCheck")
    public String loginCheck(HttpServletResponse response, LoginUser loginUser){
//        System.out.println("进来了");
        APIResult apiResult = loginService.loginCheck(response, loginUser.getUsername(),loginUser.getPassword());
        if ("000".equals(apiResult.getCode())){
            return "user.jsp";
        }
        return "login.jsp";
    }
}
