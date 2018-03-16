package com.demo.w.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibMethod implements MethodInterceptor {

    public <T> T getCglibProxy(Class cls){
        return (T)Enhancer.create(cls,this);
    }
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        proxy.invokeSuper(obj,args);
        return null;
    }
}
