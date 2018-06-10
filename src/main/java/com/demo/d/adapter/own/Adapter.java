package com.demo.d.adapter.own;


import java.util.ArrayList;
import java.util.List;

/**
 * 适配器 将系统的老接口数据转换为新系统所需要的形式，
 * 不影响老接口数据的调用，同时也能满足新接口的要求
 */
public class Adapter extends Query implements  QueryList{

    @Override
    public List<String> getList() {
        List<String> list = new ArrayList<>();
        String str[] = getStr();
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }
        return list;
    }

}
