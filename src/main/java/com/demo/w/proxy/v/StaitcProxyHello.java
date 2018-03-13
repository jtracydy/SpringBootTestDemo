package com.demo.w.proxy.v;

public class StaitcProxyHello implements Hello{

    private Hello hello = new HelloImpl();
    @Override
    public void say() {
        before();
        hello.say();
        after();
    }
    private void before(){
        System.out.println("before say something");
    }
    private void after(){
        System.out.println("after say something");
    }
}
