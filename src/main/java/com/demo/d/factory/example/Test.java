package com.demo.d.factory.example;

public class Test {

    public static void main(String[] args) {
        /**
         * 多方法静态工厂(模仿Executor类）
         */
        INoodles lz2 = MulWayNoodlesFactory.createLz();
        lz2.desc();

        INoodles gk2 = MulWayNoodlesFactory.createGk();
        gk2.desc();

        INoodles nk = MulWayNoodlesFactory.createNr();
        nk.desc();

        /**
         * 工厂方法：
         */
        NoodlesFactory factory1 = new GankouFactory();
        INoodles gk3 = factory1.create();
        gk3.desc();

        NoodlesFactory factoryNor = new NorthFactory();
        INoodles nor = factoryNor.create();
        nor.desc();

        /**
         * 抽象
         */

        AbstractFoodFactory abstractFoodFactory1 = new KFCFoodFactory();
        abstractFoodFactory1.createDrinks().prices();
        abstractFoodFactory1.createNoodles().desc();

        abstractFoodFactory1= new LzlmFoodFactory();
        abstractFoodFactory1.createDrinks().prices();
        abstractFoodFactory1.createNoodles().desc();


        AbstractFoodFactory norFactory = new NorthFoodFactory();
        norFactory.createNoodles().desc();
        norFactory.createDrinks().prices();
    }
}
