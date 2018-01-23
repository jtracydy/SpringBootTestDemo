package com.demo.d.pattern.strategy;


/**
 *  会员父类，会员分为白银、黄金、钻石
 * 白银 8折
 * 黄金 7折
 * 钻石 6折
 */
public interface  Member {

    String saleGrade(String name);
}
