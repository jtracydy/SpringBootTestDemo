package com.demo.w.Innner;

public class Outer {
    private String name;
    private String age;
    private String outer = "";


    public class Inner {
        private String inner = "inner";

        String innerPub = "inner";

        //static String staticStr = "";

        public void display() {
            System.out.println(getAge() + " " + getName());
        }

        public Outer getOuterInstance() {
            /**
             * 通过外部类型获取外部类型实例
             */
            return Outer.this;
        }

    }

    /**
     * 内部类依赖外部类而生存，也就是说外部类属于内部类的一部分，被static 修饰的属性属于类的属性，
     */
    public static class InnserStatic {
        static String str = "InnserStatic";
        public void display(){
            System.out.println("static class");
        }
    }

    public void getInnser() {
        /**
         * 外部类无法访问内部类型信息
         */
//        Inner.class.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
