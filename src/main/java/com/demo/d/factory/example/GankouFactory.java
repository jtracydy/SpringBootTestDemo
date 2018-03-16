package com.demo.d.factory.example;

public class  GankouFactory extends NoodlesFactory {
    @Override
    public INoodles create() {
        return new GankouNoodles();
    }
}