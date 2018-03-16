package com.demo.d.factory.example;

public class LzlmFoodFactory extends AbstractFoodFactory {
    @Override
    public INoodles createNoodles() {
        return new LzNoodles();//卖兰州拉面
    }

    @Override
    public IDrinks createDrinks() {
        return new WaterDrinks();//卖水
    }
}