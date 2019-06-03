package com.qianfeng.demo.entity;

import lombok.Data;

@Data//自动生成getter和setter
public class News {
    private int id;
    private String title;
    private String content;
    private String ctime;

}
