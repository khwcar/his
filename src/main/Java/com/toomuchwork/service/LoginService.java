package com.toomuchwork.service;

import com.toomuchwork.entity.pojo.LoginUser;
import com.toomuchwork.util.APIResult;

import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: LoginService
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2021/1/7  11:37
 */
public interface LoginService {
    /**
     * 根据用户名校验用户信息
     * @param response
     * @param username
     * @return
     */
    APIResult loginCheck(HttpServletResponse response, String username,String password);
}
