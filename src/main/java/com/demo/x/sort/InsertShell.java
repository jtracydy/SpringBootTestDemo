package com.demo.x.sort;

public class InsertShell {


    public static int[] sort(int arr[]) {
        int step = 0;
        if (arr.length / 2 != 0) {
            step = (arr.length+1) / 2 ;
        }
        else {
            step = arr.length / 2;
        }
        while (step > 0) {

            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i];
                int index = i;
                for (int j = i - step; j >= 0; j -= step) {
                    if(temp < arr[j]){
                        arr[j+step] = arr[j];
                        index = j;
                    }else{
                        break;
                    }
                }
                if(i != index){
                    arr[index] = temp;
                }
            }
            step--;
        }

        return arr;
    }
}
