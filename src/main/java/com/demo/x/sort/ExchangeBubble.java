package com.demo.x.sort;

public class ExchangeBubble {

    public static int[] sort(int arr[]) {


        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i && j+1 < arr.length; j++) {
                if(arr[j+1] > arr[j] ){
                    Test.exchange(arr,j+1,j);
                }
            }
        }
        return arr;
    }
}
