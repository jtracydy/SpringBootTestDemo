package com.demo.x.sort;

public class ExchangeQuick {

    public static int[] sort(int arr[], int from, int to) {
        if(from >= to){
            return arr;
        }
        int start = from;
        int end = to;
        int temp = arr[from];
        int index =from;
        while (start < end) {
            while (start < end && arr[end] >= temp) {
                end --;
            }
            if(arr[end] < temp){
                arr[index] = arr[end];
                index = end;
            }
            while (start < end && arr[start] < temp) {
                start ++;
            }
            if(arr[start] > temp){
                arr[index] = arr[start];
                index = start;
            }

            arr[index] = temp;
        }
        sort(arr,from,index-1);
        sort(arr,index+1,to);
        return arr;
    }
}
