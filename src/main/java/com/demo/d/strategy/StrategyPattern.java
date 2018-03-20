package com.demo.d.strategy;

public class StrategyPattern {

    public String getMember(Member member,String name){
       return  member.saleGrade(name);
    }
}
