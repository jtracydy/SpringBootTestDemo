package com.demo.w.proxy.own;




public class ProxyStatic {

    private Coffee coffee = new CoffeeImpl();

    public void addSugar(){
        coffee.needCoffee();
        Util.before();
        Util.after();
    }
}
