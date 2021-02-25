package com.toomuchwork.tt;

import java.util.HashMap;
import java.util.Map;

import static com.toomuchwork.constans.Constans.USER_NAME;

/**
 * @ClassName: TT
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2021/1/7  16:05
 */
public class TT {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("ss",USER_NAME);
        System.out.println(map);
    }
}
