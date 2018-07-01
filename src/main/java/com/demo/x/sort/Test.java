package com.demo.x.sort;

public class Test {

    public static void main(String[] args) {
        int arr[] = {49, 38, 65, 97, 76, 13, 27, 49};

//        arr = Insert.sort(arr);
//        sys(arr);

//        arr = InsertShell.sort(arr);
//        sys(arr);

//        arr = ExchangeBubble.sort(arr);
//        sys(arr);

//        arr = ExchangeQuick.sort(arr, 0, arr.length - 1);
//        sys(arr);

        arr = Select.sort(arr);
        sys(arr);
    }

    public static void sys(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] exchange(int arr[], int from, int to) {
        if(from >= to)
            return arr;
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
        return arr;
    }
}
