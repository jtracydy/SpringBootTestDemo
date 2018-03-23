package com.demo.j.other;

public class Demo02 {

    public static void main(String[] args) {
        String str1 = new String("123");
        String str2 = new String("123");
        String str3 = str1;
        String str4 = "123";
        String str5 = "123";

        System.out.println(str1 == str2);
        System.out.println(str3 == str2);
        System.out.println(str3 == str4);
        System.out.println(str5 == str4);

    }
}
