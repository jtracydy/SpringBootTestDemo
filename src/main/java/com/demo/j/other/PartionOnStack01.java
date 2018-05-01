package com.demo.j.other;


public class PartionOnStack01 {
    class User{
        private int id;
        private String name;
        public User(){}
    }
    public  void foo() {
        User user=new User();
        user.id=1;
        user.name="sixtrees";
    }
    public static void main(String[] args) {
        PartionOnStack01 pos=new PartionOnStack01();
        pos.foo();
    }

}
