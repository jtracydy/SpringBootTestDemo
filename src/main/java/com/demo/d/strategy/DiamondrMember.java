package com.demo.d.strategy;


public class DiamondrMember implements Member {

    @Override
    public String saleGrade(String name) {
        return name + "是钻石会员，6折优惠";
    }
}
