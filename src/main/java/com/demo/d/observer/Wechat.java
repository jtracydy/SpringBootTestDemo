package com.demo.d.observer;

import java.util.ArrayList;
import java.util.List;

public class Wechat implements Observerable {

    List<Observer> list = new ArrayList<>();
    String message = "";
    @Override
    public void register(Observer o) {
        list.add(o);
    }

    @Override
    public void remove(Observer o) {
        if(list.contains(o)){
            list.remove(o);
        }
    }

    @Override
    public void update() {
        for (int i = 0; i < list.size(); i++) {
            Observer o = list.get(i);
            o.update(message);
        }
    }

    public void setInfomation(String s) {
        this.message = s;
        //消息更新，通知所有观察者
        update();
    }
}
