package com.demo.test;


import java.util.ArrayList;
import java.util.List;

public class Demo04 {
    public static void main(String[] args) {
        Demo04 d = new Demo04();
        User u1 = d.new User();
        u1.setAge(111);
        u1.setName("tracd");
        change(u1);
        System.out.println(u1.getAge());

        User u2 = d.new User();
        u2.setAge(222);
        u2.setName("aaaa");
        User u3 = d.new User();
        u3.setAge(222);
        u3.setName("bbbb");

        List<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);

        List<User> listRes = new ArrayList<>();
        for(User u : list){
            change(u);
            listRes.add(u);
        }

        for(User u : listRes){
            System.out.println(u.getAge());
        }


    }
    private static void change(User user){
        user.setAge(888);
        user.setName("lucas");
    }
    private class  User{
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
