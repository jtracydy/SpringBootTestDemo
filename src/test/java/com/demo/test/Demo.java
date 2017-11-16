package com.demo.test;

import java.math.BigDecimal;

public class Demo {
	public static void main(String[] args) {

//		BigDecimal b = new BigDecimal("100.01");
//
//		BigDecimal a = b.multiply(new BigDecimal(100));// 乘以100(单位：分)
//
//		System.out.println("...." + a.intValue());
//		System.out.println(a);

		BigDecimal a = BigDecimal.ZERO;
		System.out.println("construct with a String value: " + a);
		BigDecimal b = new BigDecimal("2");
		a = a.add(b);
		System.out.println("aplus b is : " + a);
		
		
		
		String str = "N F H ";
		String[] temp = str.split(" ");
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
}
