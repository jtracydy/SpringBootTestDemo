package com.demo.w.keyword;

public class Demo {

    public static void main(String[] args) {
        Father f = new Son();
        f.getFinal();

        Son s = new Son();
        s.getFinal();
        s.get();

        Son.getFinal();
        Father.getFinal();
    }
}
