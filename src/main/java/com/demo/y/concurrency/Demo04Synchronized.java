package com.demo.y.concurrency;


public class Demo04Synchronized implements  Runnable{
    private int count = 0;

    public void add() throws InterruptedException {
        synchronized (this) {
            count++;
            Thread.sleep(10000);
            System.out.println(count);
            Thread.sleep(10000);
        }
    }

    public synchronized void add1() {
        count++;
        System.out.println(count);
    }

    public void get() {
        System.out.println("no synchronized");
    }

    @Override
    public void run() {
        try{
            add();
        } catch (Exception e){
            System.out.println(e);
        }

    }
}
