package com.demo.w.Innner;

public class Demo03 {

    public static void main(String[] args) {
        InnerDemo03 inner = new InnerDemo03();
        inner.get();
    }

    private String str_out = "no_staic_out";

    private static String str_sta_out = "static_out";


    public void get(){
        System.out.println("outer.....");
    }

    public static void  getSta(){
        System.out.println("outer sta.....");
    }

    /**
     * 成员内部类中不能存在任何的静态变量，但是可以访问外围类的静态变量和普通变量
     */
    class InnserDemo{
        public void get(){
            System.out.println(Demo03.str_sta_out);
            System.out.println(str_out);
        }
    }

    /**
     * 静态内部类中不能访问外部类非静态方法
     * 静态内部类的实例化不依赖于外部类
     */
    static class InnerDemo03{
       private String str = "no_staic";
       private static String str_sta = "static";

       public void get(){
           System.out.println(Demo03.str_sta_out);
          // System.out.println(str_out);

       }
       public static void  getSta(){
           System.out.println(Demo03.str_sta_out);
//           System.out.println(d.str_out);
        }
    }


}
