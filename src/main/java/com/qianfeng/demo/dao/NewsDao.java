package com.qianfeng.demo.dao;

import com.qianfeng.demo.entity.News;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface NewsDao {
    @Insert("insert into news values(null, #{title}, #{content}, now())")
    public int insert(News news);

    @Select("select id, title, content, ctime from news order by ctime desc")
    public List<News> queryAll();
}
