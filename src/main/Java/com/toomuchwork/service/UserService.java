package com.toomuchwork.service;

import com.toomuchwork.entity.User;

import java.util.List;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2020/12/21  14:04
 */
public interface UserService {
    /**
     * 根据用户id查询用户信息
     *
     * @param userid
     * @return
     */
    User selectByPrimaryKey(Integer userid);

    /**
     * 根据学号查询多个学生
     * @param userid
     * @return
     */
    List<User> selectByUserTest(Integer[] userid);
}
