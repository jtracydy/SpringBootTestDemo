package com.demo.d.pattern.strategy;


public class SilverMember implements Member {

    @Override
    public String saleGrade(String name) {
        return name + "是白银会员，8折优惠";
    }
}
