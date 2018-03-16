package com.demo.d.factory.example;

public class PaoFactory extends NoodlesFactory {
    @Override
    public INoodles create() {
        return new PaoNoodles();
    }
}