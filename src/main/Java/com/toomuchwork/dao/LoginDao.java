package com.toomuchwork.dao;

import com.toomuchwork.entity.pojo.LoginUser;
import com.toomuchwork.mapper.LoginMapper;
import com.toomuchwork.mapper.UserMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @ClassName: LoginDao
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2021/1/7  11:28
 */
@Repository
public class LoginDao extends SqlSessionDaoSupport {
    @Resource
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    /**
     * 用户校验
     * @param username
     * @return
     */
    public LoginUser loginCheck(String username){
        LoginMapper loginMapper = this.getSqlSession().getMapper(LoginMapper.class);
        return loginMapper.loginByUserName(username);
    }
}
