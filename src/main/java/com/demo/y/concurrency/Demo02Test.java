package com.demo.y.concurrency;

public class Demo02Test {

    public static void main(String[] args) {

        for (int i = 0; i<10 ;i++){
             new Thread(new Runnable() {
                 @Override
                 public void run() {
                     int i = new Demo02().get();
                     System.out.println(i);
                 }
             }).start();
        }
    }
}
