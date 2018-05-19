package com.demo.w.excep;

import java.io.IOException;

public class Demo01 {

    public static void main(String[] args) throws NullPointerException{
        Demo01 d = new Demo01();
        d.getDemo02();
//        try {
//            d.getDemo02();
//        } catch (IOException e) {
//            System.out.println(e);
//        }
    }

    boolean getDemo01() throws NullPointerException,IOException{
        throw new NullPointerException();
    }

    boolean getDemo02() throws NullPointerException {
        try {
            getDemo01();
        } catch (IOException e) {
            System.out.println(e);
        }
        return true;
    }
}
