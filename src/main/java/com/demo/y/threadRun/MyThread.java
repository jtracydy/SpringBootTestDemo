package com.demo.y.threadRun;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread{

    private static AtomicInteger num = new AtomicInteger(0);

    public MyThread(){
    }

    @Override
    public void run() {
        num.incrementAndGet();
        System.out.println("主动创建的第"+num+"个线程");
    }
}
