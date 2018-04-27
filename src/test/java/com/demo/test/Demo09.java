package com.demo.test;

public class Demo09 {


    public static void main(String[] args) {

        String s1 = "hello";

        String s2 = "h";
        String s3 = "ello";
        String s4 = s2+s3 ;

        System.out.println(s4 == s1);
        System.out.println();

        Float f1 = new Float("123");
        Float f2 = new Float("123");
        System.out.println(f1 == f2);
        System.out.println();

        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);

        /**
         * 几个基本类型在-127到128内是支持自动拆箱比较大小的，当在范围之外是创建对象的，
         */
    }
}
