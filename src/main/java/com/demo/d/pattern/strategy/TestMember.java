package com.demo.d.pattern.strategy;

public class TestMember {

    public static void main(String[] args) {
        SaleGoods sg = new SaleGoods();
        sg.saleDiscount(new GoldMember(),"小明");
        sg.saleDiscount(new SilverMember(),"小芳");
        sg.saleDiscount(new DiamondrMember(),"小林");
    }
}
