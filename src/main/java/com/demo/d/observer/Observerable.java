package com.demo.d.observer;


/**
 * 观察者模式其实就是订阅模式，订阅了某个账户的消息，在该账户发布消息是就会收到通知
 *  被观察者模式
 */
public interface Observerable {

    void register(Observer o);

    void remove(Observer o);

    void update();
}
