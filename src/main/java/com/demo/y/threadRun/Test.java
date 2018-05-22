package com.demo.y.threadRun;

public class Test {

    public static void main(String[] args) {

        for(int i =0;i<5;i++){
            //new MyThread().start();
            new Thread(new MyRunnable()).start();
        }

    }
}
