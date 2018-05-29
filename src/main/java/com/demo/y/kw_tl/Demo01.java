package com.demo.y.kw_tl;

public class Demo01 {

    ThreadLocal<Long> lt = new ThreadLocal<>();
    ThreadLocal<String> st = new ThreadLocal<>();

    public void set() {
        lt.set(Thread.currentThread().getId());
        st.set(Thread.currentThread().getName());
    }

    public String getStr() {
        return st.get();
    }

    public Long getLong() {
        return lt.get();
    }

    public static void main(String[] args) throws InterruptedException {
        final Demo01 d = new Demo01();
        d.set();
        System.out.println(Thread.currentThread() + " " + d.getLong() + " " + d.getStr());

        Thread thread1 = new Thread() {
            public void run() {
                d.set();
                System.out.println(d.getLong());
                System.out.println(d.getStr());
            };
        };

        thread1.start();
        thread1.join();

        System.out.println(d.getLong());
        System.out.println(d.getStr());
    }
}
