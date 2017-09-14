package com.github.huyisen.spring.boot.app.web;

import com.github.huyisen.spring.boot.app.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private TestService service;

    @RequestMapping("/")
    @ResponseBody
    private String index() {

        String str = service.getHello();

        return str;
    }

    @RequestMapping("/map")
    @ResponseBody
    private Object getMap() {

        Map<String,Object> map = new HashMap<>();
        map.put("zhangshan",18);
        map.put("lisi",20);
        map.put("wangwu",22);
        map.put("laowang",25);
        map.put("xiaoming",30);
        return map;
    }


    @RequestMapping("/list")
    @ResponseBody
    private Object getList() {

        List<Object> list = new ArrayList<>();

        Map<String,Object> map = new HashMap<>();
        map.put("zhangshan",18);
        map.put("lisi",20);
        map.put("wangwu",22);
        map.put("laowang",25);
        map.put("xiaoming",30);

        list.add(map);

        return list;
    }

    @RequestMapping("/lists")
    @ResponseBody
    private Object getLists() {

        List<Object> lists = new ArrayList<>();

        Map<String,Object> map = new HashMap<>();
        map.put("zhangshan",18);
        map.put("lisi",20);
        map.put("wangwu",22);
        map.put("laowang",25);
        map.put("xiaoming",30);

        lists.add(map);
        lists.add(map);
        lists.add(map);

        return lists;
    }


}
