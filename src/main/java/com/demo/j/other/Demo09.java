package com.demo.j.other;

public class Demo09 {

    public static void main(String[] args) {
        Demo09 d = new Demo09();
        /**
         *  重载
         */
        Human h = new Man();
        Woman w = new Woman();
        Man m = new Man();
        d.sayHello(h);
        d.sayHello(new Man());
        d.sayHello(w);

        /**
         * 重写
         */
        h.dynamic(m);

    }

    public void sayHello(Human man) {
        System.out.println("Human say hello");
    }

    public void sayHello(Man man) {
        System.out.println("Man say hello");
    }

    public void sayHello(Woman man) {
        System.out.println("Woman say hello");
    }

    static abstract class Human {

        abstract void dynamic(Human man);

    }

    static class Man extends Human {

        @Override
        void dynamic(Human man) {
            System.out.println("man human");
        }

    }

    static class Woman extends Human {
        @Override
        void dynamic(Human man) {
            System.out.println("woman human");
        }
    }


}
