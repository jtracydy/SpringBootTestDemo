package com.demo.y.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Demo02 {

    private final AtomicInteger lastNumber = new AtomicInteger(1);
    private final AtomicReference<AtomicInteger> ar  = new AtomicReference<>();

    public Integer get(){
        lastNumber.incrementAndGet() ;
        ar.set(lastNumber);

        return ar.get().intValue();
    }
}
