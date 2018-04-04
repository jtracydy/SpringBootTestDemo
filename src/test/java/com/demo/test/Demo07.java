package com.demo.test;

public class Demo07 {

    static abstract class Human{

    }
    static class Man extends Human{

    }
    static class Women extends Human{

    }

    public void sayHello(Human h){
        System.out.println("hello "+ h.getClass().getName());
    }
    public void sayHello(Man h){
        System.out.println("hello "+ h.getClass().getName());
    }
    public void sayHello(Women h){
        System.out.println("hello "+ h.getClass().getName());
    }

    public static void main(String[] args) {
        Demo07 d = new Demo07();
        Human wo = new Women();
        Human m = new Man();
        d.sayHello(wo);
        d.sayHello(m);
    }
}
