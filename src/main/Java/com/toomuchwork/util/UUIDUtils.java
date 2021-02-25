package com.toomuchwork.util;
import java.util.UUID;

/**
 * @ClassName: UUIDUtils
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2021/1/5  18:51
 */
public class UUIDUtils {
        public static String getUuid () {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        System.out.println("随机生成Uuid：" + uuid);
            return uuid;
        }

        public static void main (String[]args){
        getUuid();
    }
    }
