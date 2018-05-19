package com.demo.w.Innner;

public class Demo05 {
    public static void main(String[] args) {
        Demo05 d = new Demo05();
        d.test(new Bird() {
            @Override
            String getName() {
                return null;
            }
        });
    }

    public void test(Bird bird) {
        System.out.println(bird.getName() + "能够飞 " + bird.getName() + "米");
    }
}

abstract class Bird {
    abstract String getName();
}