package com.toomuchwork.mapper;

import com.toomuchwork.entity.pojo.LoginUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: LoginMapper
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2021/1/7  11:28
 */
@Mapper
public interface LoginMapper {
    /**
     * 获取用户名和密码
     * @param username
     * @return
     */
    LoginUser loginByUserName(@Param("username") String username);
}
