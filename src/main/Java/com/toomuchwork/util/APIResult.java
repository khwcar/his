package com.toomuchwork.util;

import lombok.Data;

@Data
public class APIResult<T> {
    //请求的状态码
    private String code;
    //请求状态的说明
    private String msg;
    //请求的日期
    private T data;

    public APIResult(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public APIResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public APIResult() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
