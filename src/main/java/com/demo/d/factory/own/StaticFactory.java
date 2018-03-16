package com.demo.d.factory.own;

public class StaticFactory {

    /**
     * CarFactory是一个静态工厂类，初始化只有一个Benz类型的车
     * @return
     */
    public Car getBenz(){
        return new Benz();
    }
    /**
     * 增加同种类型的车
     */
    public Car getBwm(){
        return new Bwm();
    }

    /**
     * 工厂类中增加带参数的不同种类的产品,只需要在工厂类中增加一条即可
     */
    public Boat getBoat(String size){
        return new Yacht(size);
    }
}
