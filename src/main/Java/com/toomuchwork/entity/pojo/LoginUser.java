package com.toomuchwork.entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName: LoginUser
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2021/1/7  11:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginUser implements Serializable {
    private String username;
    private String password;
}
