package com.toomuchwork.exception;

/**
 * @ClassName: Demoxception
 * @Description: TODO
 * @author: kanghongwei
 * @date: 2020/12/24  9:45
 */
public class Demoxception extends Exception {
    private static final long serialVersionUID = 1L;

    /**
     * 提供无参数的构造方法
     */
    public Demoxception() {
    }

    /**
     * 提供一个有参数的构造方法，可自动生成
     *
     * @param msg
     */
    public Demoxception(String msg) {
        // 把参数传递给Throwable的带String参数的构造方法
        super(msg);
    }
}
