package com.demo.y.kw_vt;


public class Demo01 {

    private static volatile StableData stableData = new StableData("-1");

    public static void main(String[] args) throws InterruptedException{

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread() + " 初始值：" + stableData.getIntArr());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    stableData = new StableData( "" + i);
                    System.out.println(Thread.currentThread() + " 結束值：" + stableData.getIntArr());
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 5; i < 10; i++) {
                    System.out.println(Thread.currentThread() + " 当前值：" + stableData.getIntArr());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    stableData = new StableData("" + i);
                    System.out.println(Thread.currentThread() + " 当前值：" + stableData.getIntArr());
                }
            }
        }).start();
    }
}
