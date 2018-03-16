package com.demo.d.factory.own;

public class BwmFactory extends CarFactoryPattern {

    @Override
    public Car getCar() {
        return new Bwm();
    }
}
