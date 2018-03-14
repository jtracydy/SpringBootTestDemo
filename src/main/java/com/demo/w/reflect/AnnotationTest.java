package com.demo.w.reflect;

import java.lang.annotation.Annotation;

public class AnnotationTest {

    public static void main(String[] args) throws  Exception{

        Class zlass = Class.forName("com.demo.w.reflect.Employee");

        Annotation [] annotations =zlass.getDeclaredAnnotations();
        for(int i = 0;i < annotations.length;i++){
            System.out.println(annotations[i].annotationType());
        }
    }
}
