package com.demo.w.abstr;

public class Test {

    public static void main(String[] args) {
        Animal animal = new SmallCat();
        animal.demo();

        Cat cat = new SmallCat();
        cat.demo();
        cat.demo("s");
    }
}
