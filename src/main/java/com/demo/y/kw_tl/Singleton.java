package com.demo.y.kw_tl;

public class Singleton {

    private String age ;

    private static Singleton singleton  = new Singleton();

    public static Singleton getSingleton() {
        return singleton;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
