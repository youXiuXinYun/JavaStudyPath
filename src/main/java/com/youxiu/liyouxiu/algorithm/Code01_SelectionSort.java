package com.youxiu.liyouxiu.algorithm;

import java.util.Arrays;

//选择排序
public class Code01_SelectionSort {


    public static void main(String[] args) {

        int[] arr = {7, 8, 9, 6, 2, 5, 33};

        Code01_SelectionSort.selectionSort(arr);
    }


    public static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }

            Code01_SelectionSort.swap(arr, minIndex, i);
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int arr[], int minIndex, int i) {
        //arr[i] = arr[minIndex] ^ arr[i];
        //arr[minIndex] = arr[minIndex] ^ arr[i];
        //arr[i] = arr[minIndex] ^ arr[i];

        int tem = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tem;
    }
}
