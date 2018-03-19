package com.demo.w.proxy.own;


public class CoffeeImpl implements Coffee {

    /**
     * 咖啡当例在咖啡厅写的博客，我也比较喜欢喝咖啡，所以用来当场景了。
     * 每个人喜欢喝的口味都不相同，目前咖啡厅的功能只有来一杯咖啡。但是我觉得这个咖啡苦呀，
     * 所有我需要加糖，代理类是在原有的基础上实现加糖的
     */

    @Override
    public void needCoffee() {
        System.out.println(" I need a cup of coffee ");
    }

}
