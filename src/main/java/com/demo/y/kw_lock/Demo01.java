package com.demo.y.kw_lock;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo01 {

    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    Lock lock = new ReentrantLock();

    public static void main(String[] args) {
       final  Demo01 d = new Demo01();
        new Thread(new Runnable() {
            @Override
            public void run() {
                d.add(Thread.currentThread());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                d.add(Thread.currentThread());
            }
        }).start();
    }

    public void add(Thread thread) {
        lock.lock();
        try {
            System.out.println(thread.getName()+"得到了锁");
            for (int i = 0; i < 5; i++) {
                arrayList.add(i);
            }
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("unlock");
            lock.unlock();
        }
    }
}
