package com.demo.d.pattern.strategy;


public class GoldMember implements Member {

    @Override
    public String saleGrade(String name) {
        return name + "是黃金会员，7折优惠";
    }
}
