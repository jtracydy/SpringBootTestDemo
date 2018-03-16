package com.demo.d.factory.own;

public class BenzFactory extends CarFactoryPattern {

    @Override
    public Car getCar() {
        return new Benz();
    }
}
