package com.demo.d.factory.own;

public class BenzNewFactory extends FactoryPattern{

    @Override
    public Car getCar() {
        return new Benz();
    }

    @Override
    public Boat getBoat(String size) {
        return new Yacht(size);
    }
}
