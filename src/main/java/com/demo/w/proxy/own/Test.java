package com.demo.w.proxy.own;

public class Test {

    public static void main(String[] args) {

        System.out.println("static .........start");
        ProxyStatic proxyStatic = new ProxyStatic();
        proxyStatic.addSugar();

        System.out.println("static .........start");
        System.out.println();

        System.out.println("java dynamic .........start");

        ProxyDynamic proxyDynamic = new ProxyDynamic();
        Coffee coffee = proxyDynamic.getProxy(new CoffeeImpl());
        coffee.needCoffee();

        System.out.println("java dynamic .........end");


        System.out.println();
        System.out.println("cglib dynamic .........start");
        ProxyCglib proxyCglib = new ProxyCglib();
        coffee = proxyCglib.getProxy(CoffeeImpl.class);
        coffee.needCoffee();
        System.out.println("cglib dynamic.........end");

    }
}
