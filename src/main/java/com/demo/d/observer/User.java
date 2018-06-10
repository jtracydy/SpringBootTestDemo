package com.demo.d.observer;



public class User implements  Observer{

    private String name;

    User(String name){
        this.name = name;
    }

    @Override
    public void update(String content) {
        read(content);
    }

    public void read(String content) {
        System.out.println(name + " 收到推送消息： " + content);
    }
}
