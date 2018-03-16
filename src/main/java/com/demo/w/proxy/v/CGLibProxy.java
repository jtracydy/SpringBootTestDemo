package com.demo.w.proxy.v;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibProxy implements MethodInterceptor {

    /**
     * 1 生成代理类继承被的代理类
     * 2 代理类会生成两个方法一个是重写被调用的方法，另个一是CGLIB$xxx$0方法,代理类直接调用共父类的方法
     * 3
     *
     *
     * @param cls
     * @param <T>
     * @return
     */

    public <T> T getProxy(Class<T> cls) {
        return (T) Enhancer.create(cls, this);
    }

    /**
     *
     * @param obj
     * @param method
     * @param args
     * @param proxy
     * @return
     * @throws Throwable
     */

    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        before();
        Object result = proxy.invokeSuper(obj, args);
        after();
        return result;
    }

    private void before(){
        System.out.println("before say something");
    }
    private void after(){
        System.out.println("after say something");
    }
}