package com.demo.y.kw_syn;

import java.util.ArrayList;

public class Demo01 {


    public static void main(String[] args) {
        final DemoInneDate d = new DemoInneDate();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(d.add(Thread.currentThread()));
            }
        }).start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(d.add(Thread.currentThread()));
//            }
//        }).start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                d.get();
//            }
//        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                new DemoInneDate().get();
            }
        }).start();
    }
}

class DemoInneDate {

    private ArrayList<Integer> list = new ArrayList<>();

    public synchronized ArrayList add(Thread thread) {
        System.out.println("synchronized add.........");
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }

    public synchronized void get(){
        System.out.println("synchronized get ");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("syn get");
    }
}
