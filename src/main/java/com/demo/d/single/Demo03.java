package com.demo.d.single;

public class Demo03 {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                User user = User.getInstance();
                user.setName("tracy");
                user.setAge("123");
                System.out.println(user);
                try {
                    Thread.sleep(10000);
                    System.out.println(Thread.currentThread().getName()
                            + " " + user.getAge() + " " + user.getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                User user = User.getInstance();
                System.out.println(Thread.currentThread().getName()
                        + " " + user.getAge() + " " + user.getName());
                user.setName("tracy.......");
                user.setAge("123....");
                System.out.println(Thread.currentThread().getName()
                        + " " + user.getAge() + " " + user.getName());
            }
        }).start();
    }

}
