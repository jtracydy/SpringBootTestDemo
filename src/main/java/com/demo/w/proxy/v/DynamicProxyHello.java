package com.demo.w.proxy.v;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理：通过代理对象调用对象本身的方法。
 */
public class DynamicProxyHello implements InvocationHandler {

    /**
     * 目标是对象
     */
    private Object target;

    /**
     * Proxy ：提供静态的方法产生动态代理类对象
     * newProxyInstance： 返回指定代理类的的对象，代理对象在做newProxyInstance时，
     * 给代理类提供了什么样的接口代理类就实现这组接口
     *
     * ClassLoader loader：定义了由那个classLoader对象来加载指定的代理类
     * Class<?>[] interfaces:读取代理类实现的接口的列表
     * InvocationHandler：代理类对象在调用方法时会关联到那个InvocationHandler对象上。
     *
     * @param target
     * @return
     */
    public <T> T getProxy(Object target) {
        this.target = target;
        return (T) Proxy.newProxyInstance
                (target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                        this);
    }

    /**
     *
     * @param proxy ： 代理的真实对象
     * @param method： 代理类真实对象所要调用的真实的方法
     * @param args： 调用真实方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        /**
         * 使用反射调用目标对象的方法并传入参数
         */
        Object result = method.invoke(target,args);
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
