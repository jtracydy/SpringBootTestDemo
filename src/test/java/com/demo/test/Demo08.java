package com.demo.test;

public class Demo08 {

    class Human{

    }
     class Man extends Human{

    }
     class Women extends Human{

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
        Demo08 d = new Demo08();
        d.get(d);
    }

    public  void get(Demo08 d ){
        Human wo = new Women();
        Human m = new Man();
        d.sayHello(wo);
        d.sayHello(m);
    }
}
