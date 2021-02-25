package com.toomuchwork.util;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @ClassName: text
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2020/12/21  13:56
 */
public class text {

    public static void main(String[] args) {
        String uu = "{\"sname\":\"zhang\"}";
        JSONObject jsonObject = JSON.parseObject(uu);
        jsonObject.put("sno","1234656");
        String sname = jsonObject.getString("sname");
        System.out.println("sname:"+sname);
    }
}
