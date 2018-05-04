package com.demo.j.other;

public class Demo06 {

    public static void main(String[] args) {
        System.out.println(A.b);
    }

}

class A implements B, C {

}

interface B {
  // static  int b = 10;
}

interface C {
   static  int b = 11;
}
