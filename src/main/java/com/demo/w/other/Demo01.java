package com.demo.w.other;


public class Demo01 {

    public static void main(String[] args) {
        General g = new General();
        g.getT(new UserSon());
    }

}

class General {

    public <T extends User> T getT(T obj) {
        System.out.println(obj.getClass().getName());
        return obj;
    }
}

class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class UserSon extends User {

}

class Father {
    public void get() {

    }
}

class A {
}

class B extends A {
}

class C {
}