package com.viatom.messagepushingweb.common;

import java.io.Serializable;

/**
 * 统一json返回类
 * @author qiujiawei
 * @date 2020.07.17
 * @param <T>
 */
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 7528805354442762223L;

    /**
     * 返回代码
     */
    private int code;
    /**
     * 返回信息
     */
    private String msg;
    /**
     * 返回对象
     */
    private T data;

    /**
     * 成功返回数据
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data) {
        return new Result<T>(ResponseCode.SUCCESS.code(), ResponseCode.SUCCESS.msg(), data);
    }

    public static <T> Result<T> success() {
        return new Result<T>(ResponseCode.SUCCESS.code(), ResponseCode.SUCCESS.msg());
    }

    public static <T> Result<T> error() {
        return new Result<T>(ResponseCode.ERROR.code(), ResponseCode.ERROR.msg());
    }

    private Result(int code, String message) {
        this.code = code;
        this.msg = message;
    }

    private Result(int code, String message, T data) {
        this.code = code;
        this.msg = message;
        this.data = data;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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
