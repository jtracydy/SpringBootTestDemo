package com.demo.w.Innner;

public class Demo04 {

    public Destionation destionation(String str){
        class PDestionation implements Destionation{
            private String label;
            private PDestionation(String whereTo){
                label = whereTo;
            }
            public String readLabel(){
                return label;
            }
        }
        return new PDestionation(str);
    }

    public static void main(String[] args) {
        Demo04 parcel5 = new Demo04();
        Destionation d = parcel5.destionation("chenssy");
        System.out.println();
    }
}
