package com.demo.j.other;

public class Demo03 {

    static Demo03 d = null;

    public void alive() {
        System.out.println("yes i still  alive");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("execute finalize method");
        d = this;
    }

    public static void main(String[] args) throws InterruptedException {
        d = new Demo03();
        d = null;
        System.gc();
        Thread.sleep(500);
        if (d != null) {
            d.alive();
        } else {
            System.out.println("i  am dead");
        }

        d = null;
        System.gc();
        Thread.sleep(500);
        if (d != null) {
            d.alive();
        } else {
            System.out.println("i  am dead");
        }
    }
}
