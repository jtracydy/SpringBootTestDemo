package com.demo.test;

import java.util.Date;

public class Demo05 {

    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date();
        System.out.println(d1+" "+d2);
        System.out.println(d1.after(d2));
    }
}
