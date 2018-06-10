package com.demo.d.decorator.example;

public class ScollDecorator extends Decorator {


    public ScollDecorator(Component component) {
        super(component);
    }

    public void display(){
        super.display();
        setScoll();
    }

    public void setScoll(){
        System.out.println("增加滑轮");
    }
}
