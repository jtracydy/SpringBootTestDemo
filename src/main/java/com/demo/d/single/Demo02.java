package com.demo.d.single;

public class Demo02 {

    /**
     * 单例模式 饿汉模式
     */
    private Demo02() {

    }

    private static Demo02 d = new Demo02();

    private static Demo02 getHungerIntance() {
        return d;
    }



}
