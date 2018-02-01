package com.lzz.model;

/**
 * Created by lzz on 2018/1/21.
 */
public class Response {
    private int code;
    private String msg;

    public Response(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public static Response OK(){
        return new Response(0, "success");
    }

    public static Response Fail(){
        return new Response(1, "fail");
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
}
