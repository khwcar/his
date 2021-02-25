package com.toomuchwork.tt;

import com.toomuchwork.entity.TestBean;
import com.toomuchwork.entity.User;
import com.toomuchwork.service.Impl.UserServiceImpl;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.toomuchwork.constans.Constans.USER_NAME;

/**
 * @ClassName: Test
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2020/12/21  14:45
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-context.xml")
public class Test {
    @Resource
    UserServiceImpl service;
    @Resource
    TestBean testBean;
    @Resource
    RedisTemplate redisTemplate;
    @org.junit.Test
    public void test1(){
        Integer userid = 1;
        User user = service.selectByPrimaryKey(userid);
        System.out.println("用户的信息为："+user);
    }
    @org.junit.Test
    public void test2(){
        System.out.println(testBean);
    }
    @org.junit.Test
    public void test3(){
        Integer[] userid = new Integer[]{1,2,3};
        List<User> users = service.selectByUserTest(userid);
        System.out.println(users);
    }
    @org.junit.Test
    public void test4(){
        Map map = new HashMap();
        map.put("ss",USER_NAME);
        System.out.println(map);
    }
    @org.junit.Test
    public void test5(){
        redisTemplate.opsForValue().set("name","khew");
    }
}
