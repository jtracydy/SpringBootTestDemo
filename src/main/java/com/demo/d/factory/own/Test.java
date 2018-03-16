package com.demo.d.factory.own;

public class Test {

    public static void main(String[] args) {
        System.out.println("静态工厂类。。。。。。。。。。start");
        StaticFactory staticFactory = new StaticFactory();
        staticFactory.getBenz().type();
        /**
         * 增加同一个类型的
         */
        staticFactory.getBwm().type();
        /**
         * 增加不同类型的产品
         */
        staticFactory.getBoat("haha").size();

        System.out.println("静态工厂类。。。。。。。。。。end");
        System.out.println();
        System.out.println("工厂模式类。。。。。。。。。。start");
        CarFactoryPattern carFactoryPattern = new BenzFactory();
        carFactoryPattern.getCar().type();
        /**
         * 增加同类产品
         */
        carFactoryPattern = new BwmFactory();
        carFactoryPattern.getCar().type();
        /**
         * 增加不同类的产品，太费劲了
         */
        BoatFactoryPattern boatFactoryPattern = new YachtFactory();
        boatFactoryPattern.getBoat("qwe").size();


        System.out.println("工厂模式类。。。。。。。。。。end");
        System.out.println();
        System.out.println("抽象工厂模式类。。。。。。。。。。start");
        System.out.println("抽象工厂模式类。。。。。。。。。。end");
    }
}
