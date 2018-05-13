package com.demo.y.concurrency;

public class Demo01 {


    public static void main(String[] args) throws InterruptedException {

        for (int i= 0; i <=10;i ++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(PersonUtils.getPerson());
                }
            }).start();
        }

        Thread.sleep(5000);

        System.out.println(PersonUtils.get());
    }
}
