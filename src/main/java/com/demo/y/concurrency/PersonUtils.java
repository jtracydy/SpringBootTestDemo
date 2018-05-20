package com.demo.y.concurrency;

import java.util.concurrent.atomic.AtomicLong;

public class PersonUtils {

    private static Person person = null;

    /**
     * 线程安全管理对象
     */

    private static AtomicLong count = new AtomicLong(1);
    public static Person getPerson() {

        if(person == null){
            person =  new Person();
        }
        count.incrementAndGet();
        return person;
    }

    public static long get(){
        return count.get();
    }
}
