//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.yuewen.web;

public class ResultMessage<T> {
    private int code;
    private String msg;
    private T data;

    public ResultMessage() {
    }

    public ResultMessage(int code) {
        this.code = code;
        this.msg = "";
        this.data = null;
    }

    public ResultMessage(int code, String message) {
        this.code = code;
        this.msg = message;
        this.data = null;
    }

    public ResultMessage(int code, String message, T data) {
        this.code = code;
        this.msg = message;
        this.data = data;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
