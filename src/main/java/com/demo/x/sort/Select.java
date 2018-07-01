package com.demo.x.sort;

public class Select {


    public static int[] sort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            Test.exchange(arr,i,min);


        }
        return arr;
    }
}
