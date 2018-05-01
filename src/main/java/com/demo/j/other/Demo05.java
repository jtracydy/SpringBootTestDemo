package com.demo.j.other;

public class Demo05 {

    public static void main(String[] args) {
        System.out.println( Father.str);
    }

    static class Father {

        Father() {
            System.out.println("father constructor");
        }


        static {
            System.out.println("static");
        }

        public static String str = "类变量";
        static User user = new User();
    }

    static class User{
        User(){
            System.out.println("user constructor");
        }
    }
}
