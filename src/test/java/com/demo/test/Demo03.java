package com.demo.test;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

public class Demo03 {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        testMap(map);
        testMap2(map);
        int p = 0;
        testInt(p);
        System.out.println(JSON.toJSONString(map));
    }

    private static void testMap(Map<String,String> map){

        map.put("123","123");
    }

    private static void testMap2(Map<String,String> map){

        map.put("123","456");
    }
    private static void testInt(int p){
        p =10;
    }
}
