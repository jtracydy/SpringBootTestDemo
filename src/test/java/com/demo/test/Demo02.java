package com.demo.test;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

public class Demo02 {

    public static void main(String[] args) {
        Map<String ,String> map   = new HashMap<>();
        map.put("str","aaa");
        System.out.println(JSON.toJSONString(map));
    }
}
