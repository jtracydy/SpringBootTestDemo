package com.demo.d.strategy;

public class Test {

    public static void main(String[] args) {
        StrategyPattern strategyPattern = new StrategyPattern();
        String str = strategyPattern.getMember(new GoldMember(),"jj");
        System.out.println(str);
    }
}
