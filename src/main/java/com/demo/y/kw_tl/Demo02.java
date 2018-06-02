package com.demo.y.kw_tl;

public class Demo02 {

    private ThreadLocal<Singleton> threadLocal = new ThreadLocal<>();

    /**
     * 不同线程，同一个ThreadLocal是不一样的，
     * 同一个对象的在THreadLocal中都存在相同的对象副本，但是对象之间的相互操作互相不会影响。
     * @param args
     */
    public static void main(String[] args) {
        final Demo02 d = new Demo02();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton =  Singleton.getSingleton();
                System.out.println(singleton+" " +singleton.getClass().getName());
                d.set(singleton,Thread.currentThread().getName());
                System.out.println(d.get());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton =  Singleton.getSingleton();
                System.out.println(singleton+"||"+singleton.getClass().getName());
                d.set(singleton,Thread.currentThread().getName());
                System.out.println(d.get());
            }
        }).start();
    }

    public void set(Singleton singleton,String str){
        singleton.setAge(str);
        threadLocal.set(singleton);
    }

    public String get(){
        return threadLocal.get().getAge();
    }
}
