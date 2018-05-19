package com.demo.w.Innner;

public class Demo02 {

    public static void main(String[] args) {
        Demo02 d = new Demo02();
        Inner inner =d.getInner(3);
        System.out.println(inner.getNumber());

    }
    public Inner getInner(final int num){
        return new Inner() {
            int number = num + 3;
            public int getNumber(){
                return number;
            }
        };
    }
    interface Inner{
        int getNumber();
    }
}
