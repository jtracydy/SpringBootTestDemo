package com.demo.w.clone;

public class Test {

    public static void main(String[] args) {

        System.out.println("直接引用。。。。。start");
        Teacher t = new Teacher();
        Student stuDirect = new Student();
        stuDirect.setAge(11);
        stuDirect.setName("lucas");
        stuDirect.setTeacher(t);;

        Student stuDirect1 = stuDirect;
        System.out.println("stuDirect1:"+stuDirect1+" stuDirect1.teacher: "+stuDirect1.getTeacher()+" " +
                "stuDirect1.name: "+stuDirect1.getName()+" stuDirect1.int[]: "+stuDirect1.i[0]
                +" stuDirect1.String[]: "+stuDirect1.s[0]+" stuDirect1.teacher[]: "+stuDirect1.t[0]);
        System.out.println("stuDirect:"+stuDirect+" stuDirect.teacher: "+stuDirect.getTeacher()+" " +
                "stuDirect.name: "+stuDirect.getName()+ " stuDirect.int[]: "+stuDirect.i[0]
                +" stuDirect.String[]: "+stuDirect.s[0]+" stuDirec.teacher[]: "+stuDirect.t[0]);
        stuDirect1.setTeacher(new Teacher());
        stuDirect.setName("tracy");
        stuDirect.i[0] = 11;
        stuDirect1.s[0] = "aa";
        stuDirect.t[0] = new Teacher();
        System.out.println("直接引用重新赋值。。。。。");
        System.out.println("stuDirect1:"+stuDirect1+" stuDirect1.teacher: "+stuDirect1.getTeacher()+" " +
                "stuDirect1.name: "+stuDirect1.getName()+" stuDirect1.int[]: "+stuDirect1.i[0]
                +" stuDirect1.String[]: "+stuDirect1.s[0]+" stuDirect1.teacher[]: "+stuDirect1.t[0]);
        System.out.println("stuDirect:"+stuDirect+" stuDirect.teacher: "+stuDirect.getTeacher()+" " +
                "stuDirect.name: "+stuDirect.getName()+ " stuDirect.int[]: "+stuDirect.i[0]
                +" stuDirect.String[]: "+stuDirect.s[0]+" stuDirec.teacher[]: "+stuDirect.t[0]);
          /**
           * 直接引用是引用的一个赋值过程，将来两个引用都指向通一个对象地址，
           * 通过引用来操作对象的，所以任何的引用操作可以改变对象的值.
           * int[] String str[] Teacher[] 是引用类型指向同一个地址。
           */

//        System.out.println("直接引用。。。。。end");

//        System.out.println("浅copy。。。。。start");
//        Student stuSh = (Student)stuDirect.clone();
//        System.out.println("stuDirect:"+stuDirect+" stuDirect.teacher: "+stuDirect.getTeacher()+" stuDirect.name: "+stuDirect.getName());
//        System.out.println("stuSh:"+stuSh+" stuSh.teacher: "+stuSh.getTeacher()+" stuSh.name: "+stuSh.getName());
//        System.out.println("浅copy引用重新赋值。。。。。");
//        stuSh.setName("clone");
//        stuDirect.setTeacher(new Teacher());
//        System.out.println("stuDirect:"+stuDirect+" stuDirect.teacher: "+stuDirect.getTeacher()+" stuDirect.name: "+stuDirect.getName());
//        System.out.println("stuSh:"+stuSh+" stuSh.teacher: "+stuSh.getTeacher()+" stuSh.name: "+stuSh.getName());
          /**
           * 1. clone 方法是的访问修饰符protect，所以夸包使用clone方法需要重写此方法。
           *    clone方法复制了原来的对象，和原来对象的值相同，但是在对内存中开辟了一段新的内存空间。
           *    原有引用和clone赋值之后的引用分别指向不同的对象，两个引用指向的对象相互不关联。
           *    但对类型的属性来说，基本类型（包括string类型）是值复制，而是对引用类型（包括数组）的属性是引用复制。
          */
//        System.out.println("浅copy。。。。。end");

        System.out.println("深copy。。。。。start");

        System.out.println("深copy。。。。。end");

        System.out.println();
    }
}
