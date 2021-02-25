package com.toomuchwork.service.Impl;

import com.toomuchwork.dao.LoginDao;
import com.toomuchwork.entity.pojo.LoginUser;
import com.toomuchwork.service.LoginService;
import com.toomuchwork.util.APIResult;
import com.toomuchwork.util.UUIDUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import java.util.concurrent.TimeUnit;

import static com.toomuchwork.constans.Constans.USER_NAME;

/**
 * @ClassName: LoginServiceImpl
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2021/1/7  11:37
 */
@Slf4j
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    LoginDao loginDao;

    @Resource
    RedisTemplate<String,Object> redisTemplate;

    @Override
    public APIResult loginCheck(HttpServletResponse response, String username,String password) {
        //接收用户名
        if (StringUtils.isBlank(username)){
            log.error("用户名不能为空");
            return new APIResult("201","用户名不能为空",null);
        }
        if (StringUtils.isBlank(password)){
            log.error("密码不能为空");
            return new APIResult("211","密码不能为空",null);
        }
        //查询该用户名是否存在（从数据库中获取用户）
        LoginUser loginUser = loginDao.loginCheck(username);
        //如果数据库不存在
        if (null==loginUser){
            log.error("该用户没有注册过任何信息,请先注册在登录,失败用户名：{}",username);
            return new APIResult("202","该用户没有注册过任何信息，请先注册在登录");
        }
        //如果数据库存在
        //校验密码
        if (StringUtils.equals(password.trim(),loginUser.getPassword())){
            //获取uuid
            String uuid = UUIDUtils.getUuid();
            log.info("获取到该用户产生的uuid",uuid);
            //将信息存储在cooker中（name="user_token"）
            Cookie cookie = new Cookie(USER_NAME, uuid);
            //响应cookie存放在
            response.addCookie(cookie);
//            log.info("key得值：{}",username+"/"+uuid);
//            log.info("value得值:{}",loginUser);
            System.out.println(username+"/"+uuid);
            System.out.println(loginUser);
            System.out.println(redisTemplate);
            //将信息存储在redis中
            redisTemplate.opsForValue().set(username+"/"+uuid,loginUser,20, TimeUnit.MINUTES);
            log.info("登录成功");
            return new APIResult("000","成功",loginUser);
        }
        return new APIResult("444","用户密码不正确请从新输入");
    }
}
