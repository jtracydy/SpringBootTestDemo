package com.demo.d.adapter.own;


/**
 * 实现适配器接口
 * <p>
 * 老系统实现查询数据的结果，将老数据的封装成新的list返回给系统显示
 */
public class Query {

    private String[] str = new String[]{"abc", "efg", "xyz"};

    public String[] getStr() {
        return str;
    }
}
