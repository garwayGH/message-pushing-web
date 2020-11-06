package com.viatom.messagepushingweb.common;


/**
 * 返回标识和消息枚举类
 * @author qiujiawei
 * @date 2020/08/10
 */
public enum ResponseCode {
    /**
     * 成功
     */
    SUCCESS(200, "成功"),

    /**
     * 失败
     */
    ERROR(500, "系统异常");

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    private final int code;
    private final String msg;

    public int code() {
        return code;
    }
    public String msg() {
        return msg;
    }

}
