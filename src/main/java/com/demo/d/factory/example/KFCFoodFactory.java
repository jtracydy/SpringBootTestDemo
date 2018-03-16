package com.demo.d.factory.example;

public class KFCFoodFactory extends AbstractFoodFactory {
    @Override
    public INoodles createNoodles() {
        return new PaoNoodles();//KFC居然卖泡面
    }

    @Override
    public IDrinks createDrinks() {
        return new ColaDrinks();//卖可乐
    }
}