package com.toomuchwork.dao;

import com.toomuchwork.entity.User;
import com.toomuchwork.mapper.UserMapper;
import com.toomuchwork.mapper.UserTest;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Userdao
 * @Description: 编写用户信息Dao层
 * @author: kanghongwei
 * @date: 2020/12/21  13:58
 */
@Repository
public class Userdao extends SqlSessionDaoSupport {
    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
    /**
     * @param userid
     * @return
     */
    public User selectByPrimaryKey(Integer userid) {
        if (userid == 0) {
            return null;
        }
        UserMapper mapper = this.getSqlSession().getMapper(UserMapper.class);
        User user = mapper.selectByPrimaryKey(userid);
        return user;
    }

    /**
     * 输入多个学号查信息
     * @param userid
     * @return
     */
    public List<User> selectByUserTest(Integer[] userid){
        List list = new ArrayList();
        for(Integer uid:userid){
            UserTest mapper = this.getSqlSession().getMapper(UserTest.class);
            User user = mapper.selectByUserTest(uid);
            list.add(user);
        }
        return list;
    }
}
