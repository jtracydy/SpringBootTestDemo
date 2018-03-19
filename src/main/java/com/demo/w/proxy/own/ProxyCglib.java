package com.demo.w.proxy.own;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyCglib implements MethodInterceptor {

    private Object target;

    public <T> T getProxy(Class<T> zlass){
        return (T)Enhancer.create(zlass,this);
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object obj = methodProxy.invokeSuper(o,objects);
        Util.before();
        Util.after();
        return obj;
    }
}
