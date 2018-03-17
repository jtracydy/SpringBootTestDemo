package com.demo.w.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 获取运行时动态类或者接口的方式
 */
public class ObtainClass {

    public static void main(String[] args) throws Exception, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        User user1 = new User();
        Class c1 = user1.getClass();


        System.out.println("className=="+c1.getName());
        System.out.println("classLoader=="+c1.getClassLoader());
        Method method[] = c1.getMethods();
        System.out.println("Method==");
        for (int i = 0;i < method.length;i++){
            System.out.println(i+" "+method[i].getName());
        }
        System.out.println("Fields==");
        Field [] field = c1.getFields();
        for (int i = 0;i < field.length;i++){
            System.out.println(i+" "+field[i].getName());
        }

        System.out.println("annotation "+c1.isAnnotation());
        System.out.println("constructor==");

        Constructor[] constructor = c1.getConstructors();
        for (int i = 0;i < constructor.length;i++){
            System.out.println(i+" "+constructor[i]);
        }
        System.out.println("constructor all ==");
        Constructor[] constructor2 = c1.getDeclaredConstructors();
        for (int i = 0;i < constructor2.length;i++){
            System.out.println(i+" "+constructor2[i]);
        }
        System.out.println("con...............");
        Constructor con = c1.getDeclaredConstructor(String.class,String.class);
        con.setAccessible(true);


        User o = (User)con.newInstance("lucas","pwd");
        System.out.println(o.getUserName());
        System.out.println("setvalue.......");
        /**
         * Field、constructor、method的调用都是本身对象调用的
         * Object obj = Constructor.newInstance(paramater)
         * Field.set（obj,value）
         * Method.invoke(obj,paramater)
         *
         * 构造器：通过参数的类型，选择调用的constructor创建对象
         *
         * 域属性：可以通过域属性获取要设置的属性，然后通过set给某个对象的属性设置该属性值
         *
         * 方法: 可以通过方法对象获取要调用的方法，然后通过invoke方法调用某个对象的方法
         */
        c1.getField("pwd").set(o,"return");
        System.out.println(o.getPwd());

        User user2 = new User();
        Class cu = user2.getClass();
        Class c2 = User.class;
        Class c3 = null;
        try {
            c3 = Class.forName("com.demo.w.reflect.User");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        System.out.println(c2 == c3);
    }
}
