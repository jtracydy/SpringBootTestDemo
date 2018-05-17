package com.demo.w.interf;

public class Demo03 implements Demo01,Demo02{

    @Override
    public void get() {
        System.out.println("demo.........");
    }

    public static void main(String[] args) {
        Demo01 d1 = new Demo03();
        Demo02 d2 = new Demo03();
        d1.get();
        d2.get();
    }
}
