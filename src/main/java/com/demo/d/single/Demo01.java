package com.demo.d.single;

import com.demo.w.keyword.Demo;

public class Demo01 {

    /**
     * 单例模式懒汉模式
     */
    private Demo01 d = null;

    private Demo01() {

    }

    private Demo01 getLazyInstance() {
        if (d == null) {
            d = new Demo01();
        }
        return d;
    }

    /**
     * 线程安全的懒汉模式
     *
     * @return
     */
    private final static Demo01 getSecurity() {
        return GetDemo.d;
    }

    private static class GetDemo {
        static final Demo01 d = new Demo01();
    }
}
