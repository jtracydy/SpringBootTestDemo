package com.demo.w.Innner;

public class Demo01 {


    public static void main(String[] args) {
//        Outer outer = new Outer();
//        outer.setAge("123");
//        outer.setName("lucas");
//
//        Outer.Inner inner = outer.new Inner();
//        inner.display();

        TestDemo t = new TestDemo();
        TestDemo.get();
    }


}

class TestDemo{
    private static String str = "staticStr";

    static {
        System.out.println(str);
    }

    public static void get(){
        System.out.println("method static");
    }
}