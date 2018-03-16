package com.demo.w.proxy.v;

public class CglibTest {

    public static void main(String[] args) {
        CGLibProxy cgLibProxy = new CGLibProxy();
        HelloImpl helloProxy = cgLibProxy.getProxy(HelloImpl.class);

        helloProxy.say();
    }
}
