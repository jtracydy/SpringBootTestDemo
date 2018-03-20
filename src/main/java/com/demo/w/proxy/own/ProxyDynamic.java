package com.demo.w.proxy.own;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDynamic implements InvocationHandler{
    /**
     * 代理的对象
     */
    private Object target;
    public  <T> T getProxy(Object target){

        /**
         * newProxyInstance的三个参数
         * ClassLoader loader：定义了由那个classLoader对象来加载指定的代理类
         * Class<?>[] interfaces:读取代理类实现的接口的列表
         * InvocationHandler：代理类对象在调用方法时会关联到那个InvocationHandler对象上
         */

        this.target = target;
        return (T)Proxy.newProxyInstance
                (target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    /**
     *
     * @param proxy  代理类
     * @param method 代理类真实对象所要调用的真实的方法
     * @param args： 调用真实方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /**
         * 利用反射代用被代理类的方法
         */
        method.invoke(target,args);
        //method.invoke(proxy,args);
        Util.before();
        Util.after();
        return null;
    }
}
