package com.qianfeng.demo.service.impl;

import com.qianfeng.demo.dao.NewsDao;
import com.qianfeng.demo.entity.News;
import com.qianfeng.demo.service.NewsService;
import com.qianfeng.demo.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired(required = false)
    private NewsDao newsDao;
    @Override
    public R save(News news) {
        if (newsDao.insert(news) > 0){
            return new R(1, "OK", null);
        }else{
            return new R(0, "ERROR", null);
        }
    }

    @Override
    public R queryAll() {
        return new R(1, "OK", newsDao.queryAll());
    }
}
