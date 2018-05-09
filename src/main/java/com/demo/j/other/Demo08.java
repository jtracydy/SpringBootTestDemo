package com.demo.j.other;

public class Demo08 {

    public static void main(String[] args) {
        G g = new G();
        g.get(1);
    }
}


class G {
    public void get(int a) {
        System.out.println(a);
    }

}