package com.demo.d.pattern.strategy;

public class SaleGoods {

    public void saleDiscount(Member m, String name) {
        System.out.println(m.saleGrade(name));
    }
}
