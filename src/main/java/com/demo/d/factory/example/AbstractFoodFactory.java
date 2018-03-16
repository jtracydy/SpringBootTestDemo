package com.demo.d.factory.example;

public abstract class AbstractFoodFactory {
    /**
     * 生产面条
     *
     * @return
     */
    public abstract INoodles createNoodles();

    /**
     * 生产饮料
     */
    public abstract IDrinks createDrinks();
}