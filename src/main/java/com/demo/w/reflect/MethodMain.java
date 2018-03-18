package com.demo.w.reflect;

import java.lang.reflect.Method;

public class MethodMain {

    public static void main(String[] args) throws Exception {
        Class zlass = Class.forName("com.demo.w.reflect.MainClass");

        Object o = zlass.newInstance();
        Method method = zlass.getMethod("main",String[].class);

        String [] str = new String[]{"1","2","3"};
        method.invoke(o,(Object) str);
    }
}
