package com.demo.d.factory.example;

public class NorthFactory extends  NoodlesFactory{
    @Override
    public INoodles create() {
        return new NorthNoodle();
    }
}
