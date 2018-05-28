package com.demo.y.kw_lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Demo04 {

    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        final Demo04 d = new Demo04();
        new Thread(new Runnable() {
            @Override
            public void run() {
                d.get(Thread.currentThread());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                d.get(Thread.currentThread());
            }
        }).start();
    }

    public void get(Thread thread) {
        lock.readLock().lock();
        try {
            long start = System.currentTimeMillis();

            while (System.currentTimeMillis() - start <= 1) {
                System.out.println(thread.getName() + "正在进行读操作");
            }
            System.out.println(thread.getName() + "读操作完毕");
        } finally {
            lock.readLock().unlock();
        }
    }
}
