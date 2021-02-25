package com.toomuchwork.service.Impl;

import com.toomuchwork.dao.Userdao;
import com.toomuchwork.entity.User;
import com.toomuchwork.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: UserServiceImpl
 * @Description: 操作用户业务逻辑层
 * @author: kanghongwei
 * @date: 2020/12/21  14:05
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private Userdao userdao;

    @Override
    public User selectByPrimaryKey(Integer userid) {
        return userdao.selectByPrimaryKey(userid);
    }

    @Override
    public List<User> selectByUserTest(Integer[] userid) {
        return userdao.selectByUserTest(userid);
    }
}
