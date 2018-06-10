package com.demo.d.decorator.example;

public class Test {

    public static void main(String[] args) {

        Component component,scoll;
        component = new Window();
        scoll = new ScollDecorator(component);
        scoll.display();
    }
}
