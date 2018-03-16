package com.demo.d.factory.example;

public class LzFactory extends NoodlesFactory {
    @Override
    public INoodles create() {
        return new LzNoodles();
    }
}