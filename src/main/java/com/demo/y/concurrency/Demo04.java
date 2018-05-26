package com.demo.y.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo04 {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newCachedThreadPool();

        Demo04Synchronized d = new Demo04Synchronized();
        service.execute(d);

        d.add1();


    }
}

