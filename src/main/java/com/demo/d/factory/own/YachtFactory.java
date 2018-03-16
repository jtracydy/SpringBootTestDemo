package com.demo.d.factory.own;

public class YachtFactory extends BoatFactoryPattern{

    @Override
    public Boat getBoat(String size) {
        return new Yacht(size);
    }
}
