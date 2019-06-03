package com.qianfeng.demo.vo;

import lombok.Data;

@Data
public class R {
    private int code;
    private String msg;
    private Object data;

    public R() {
    }

    public R(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
