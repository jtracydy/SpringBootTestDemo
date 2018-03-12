package com.demo.test;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {
        String formate = "yyyyMMdd";
        String d1 =  DateFormatUtils.format(new Date(),formate);
        System.out.println(d1);
        String d2 =  DateFormatUtils.format(new Date(),formate);
        System.out.println(d2);


        System.out.println(d1.equals(d2));
    }
}
