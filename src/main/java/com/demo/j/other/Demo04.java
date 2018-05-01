package com.demo.j.other;

public class Demo04 {

    public static void main(String[] args) {
        System.out.println(Son.str );
        /**
         * father static
         * father's variable
         */
        System.out.println(Son.a);
    }
    static class Son extends Father implements Other{
//        private  static int a = 3;
        static{
            System.out.println("Son static");
        }
    }



    static class  Father{

        private  static int a = 4;
        static{
            System.out.println("father static");
        }

        static String str = "father's variable";
    }

    interface  Other{
        static int a = 48;
    }
}
