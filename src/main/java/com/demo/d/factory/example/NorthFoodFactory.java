package com.demo.d.factory.example;

public class NorthFoodFactory extends AbstractFoodFactory {
    @Override
    public INoodles createNoodles() {
        return new NorthNoodle();
    }

    @Override
    public IDrinks createDrinks() {
        return new NorthDrinks();
    }
}
