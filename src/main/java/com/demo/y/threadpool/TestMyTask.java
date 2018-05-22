package com.demo.y.threadpool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestMyTask {

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200,
                TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(5));

        for (int i = 0; i < 15; i++) {
            executor.execute(new MyTask(i));
            System.out.println(executor.getPoolSize()+" "+executor.getCorePoolSize());
        }
    }
}
