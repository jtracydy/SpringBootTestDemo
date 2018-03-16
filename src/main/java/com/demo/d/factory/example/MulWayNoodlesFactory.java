package com.demo.d.factory.example;

public class MulWayNoodlesFactory {

    /**
     * 模仿Executors 类
     * 生产泡面
     *
     * @return
     */
    public static INoodles createPm() {
        return new PaoNoodles();
    }

    /**
     * 模仿Executors 类
     * 生产兰州拉面
     *
     * @return
     */
    public static INoodles createLz() {
        return new LzNoodles();
    }

    /**
     * 模仿Executors 类
     * 生产干扣面
     *
     * @return
     */
    public static INoodles createGk() {
        return new GankouNoodles();
    }

    /**
     * 东北面条
     * @return
     */
    public static INoodles createNr() {
        return new NorthNoodle();
    }
}