package com.qianfeng.demo.service;

import com.qianfeng.demo.entity.News;
import com.qianfeng.demo.vo.R;

public interface NewsService {
    public R save(News news);
    public R queryAll();
}
