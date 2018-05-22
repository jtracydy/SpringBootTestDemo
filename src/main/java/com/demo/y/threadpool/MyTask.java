package com.demo.y.threadpool;

public class MyTask implements Runnable {

    private int taskNum;

    public MyTask(int num) {
        this.taskNum = num;
    }

    @Override
    public void run() {
        System.out.println("正在执行task " + taskNum);
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("task " + taskNum + "执行完毕");
    }
}
