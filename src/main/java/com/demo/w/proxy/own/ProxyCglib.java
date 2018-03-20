package com.demo.w.proxy.own;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyCglib implements MethodInterceptor {

    private Object target;

    /**
     * 创建代理类的代理方法
     * @param zlass 被代理类的.class对象
     * @param <T>
     * @return
     */
    public <T> T getProxy(Class<T> zlass){
        return (T)Enhancer.create(zlass,this);
    }

    /**
     * 调用代理类的方法
     * @param o 代理对象
     * @param method 被代理类的方法对象
     * @param objects 调用代理方法的参数
     * @param methodProxy 代理类方法对象
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object obj = methodProxy.invokeSuper(o,objects);
        Util.before();
        Util.after();
        return obj;
    }
}
