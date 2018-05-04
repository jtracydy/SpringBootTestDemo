package com.demo.j.other;


public class Demo07{
    /**
     * 动态决定D的实现类的类型
     * @param d
     */
    public void choice(D d){
        d.get();
    }
    public static void main(String[] args) {
        Demo07 d = new Demo07();
        d.choice(new E());
        d.choice(new F());
    }
}
interface  D{
    void get();
}
class E implements D{
    @Override
    public void get() {
        System.out.println("E..get()");
    }
}
class F implements D{

    @Override
    public void get() {
        System.out.println("F..get()");
    }
}
