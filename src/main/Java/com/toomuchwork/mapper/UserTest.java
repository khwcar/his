package com.toomuchwork.mapper;

import com.toomuchwork.entity.User;
import com.toomuchwork.entity.pojo.LoginUser;

/**
 * @ClassName: UserTest
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2020/12/23  14:41
 */
public interface UserTest {
     /**
      * 根据id查询对应医生的信息
      * @param userid
      * @return
      */
     User selectByUserTest(Integer userid);

}
