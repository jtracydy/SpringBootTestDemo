package com.demo.d.observer;


/**
 * 抽象观察者，当订阅目标发出消息是，通过该接口通知观察者
 */
public interface Observer {

    void update(String content);
}
