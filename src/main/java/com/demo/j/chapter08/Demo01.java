package com.demo.j.chapter08;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class Demo01 {

    static class ClassA {
        public void println(String s) {
            System.out.println(s + " ");
        }
    }

    public static void main(String[] args) throws  Throwable{
        Object obj = System.currentTimeMillis() % 2 == 0 ? System.out : new ClassA();
        getMH(obj).invokeExact("icyfenix");
    }

    private static MethodHandle getMH(Object reciver) throws Throwable{
        MethodType mt = MethodType.methodType(void.class,String.class);

        return MethodHandles.lookup().findVirtual(reciver.getClass(),"println",mt);
    }
}
