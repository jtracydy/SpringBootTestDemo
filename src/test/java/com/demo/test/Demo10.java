package com.demo.test;

public class Demo10 {

    public static void main(String[] args) {


        /**
         * 如果 字符串常量池中存在一个等于次String的字符串，
         * 则返回代表池中这个字符串的string对象
         */
        String str1 = new StringBuilder("计算").append("机").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("java").append("va").toString();
        System.out.println(str2.intern() == str2);
    }
}
