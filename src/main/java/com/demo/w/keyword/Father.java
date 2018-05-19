package com.demo.w.keyword;

public class Father {
    final String strFinal = "strFinal";
    final static String ss;
    final  String con;
    String str = "str";

    /**
     * final 关键字在static 代码块中赋值、构造方法中赋值和直接赋值
     */
    static {
        ss = "123";
    }
    Father(){
        con = "constructor";
    }

    /**
     * final+方法 无法被重写，和private方法差不多了，可以直接被继承使用。
     */

    public final static void getFinal(){
        //strFinal = "123";
        //ss = "123";
        System.out.println("method final....");
    }

    public final void get(){
        System.out.println("final get......");
    }
    public  void getInteger(final int i){
        // i++;
        System.out.println("method final....");
    }
}
