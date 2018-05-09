package com.demo.d.factory.own;

public abstract  class CarFactoryPattern {

   public abstract Car getCar();


   /**
    * 如果在原有抽象工厂中直接增加一个类型，其他的所有具体的产品产生工厂都需要增加一个类型，
    * 这个类型这个产品也能产生呀，所以就不能增加了,需要新增抽象产品工厂
    * public abstract Boat getBoat();
    * @return
    */

}
