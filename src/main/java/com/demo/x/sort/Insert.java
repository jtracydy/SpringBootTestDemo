package com.demo.x.sort;


public class Insert {


    public static int[] sort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (temp < arr[j]) {
                    arr[j + 1] = arr[j];
                    index = j;
                } else {
                    break;
                }
            }
            if(index != i){
                arr[index] = temp;
            }
        }
        return arr;
    }
}
