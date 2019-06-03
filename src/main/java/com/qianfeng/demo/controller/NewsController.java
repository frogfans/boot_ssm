package com.qianfeng.demo.controller;


import com.qianfeng.demo.entity.News;
import com.qianfeng.demo.service.NewsService;
import com.qianfeng.demo.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
@Api(value = "新闻操作",tags = "新闻操作") //修饰是类 标记类是做什么的
public class NewsController {
    @Autowired
    private NewsService newsService;

    //新增
    @CrossOrigin//允许跨域
    @ApiOperation(value = "新增新闻",notes = "这是一个实现新闻新增的方法，需要参数信息") //修饰方法
    @RequestMapping(value = "news/save.do",method = RequestMethod.POST)
    @ResponseBody
    public R save(@RequestBody News news){

        return newsService.save(news);
    }
    //查询
    @CrossOrigin//允许跨域
    @ApiOperation(value = "查询全部新闻",notes = "这是一个实现查询全部新闻")
    @RequestMapping(value = "news/all.do",method = RequestMethod.GET)
    @ResponseBody
    public R all(){
        return newsService.queryAll();
    }

}
