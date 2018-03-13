package com.demo.w.proxy.v;

public class Test {
    public static void main(String[] args) {
        StaitcProxyHello staitcProxyHello = new StaitcProxyHello();
        //staitcProxyHello.say();

        DynamicProxyHello dynamicProxyHello = new DynamicProxyHello();
        Hello hello  =  (Hello) dynamicProxyHello.getProxy(new HelloImpl());
        hello.say();
    }
}
