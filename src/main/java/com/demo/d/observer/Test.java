package com.demo.d.observer;

public class Test {

    public static void main(String[] args) {

        Wechat wechat = new Wechat();

        Observer u1 = new User("zhangsan");
        Observer u2 = new User("lisi");
        Observer u3 = new User("wangwu");

        wechat.register(u1);
        wechat.register(u2);
        wechat.register(u3);

        wechat.setInfomation("hello java");

        wechat.remove(u1);
        wechat.setInfomation("hello C++");
    }
}
