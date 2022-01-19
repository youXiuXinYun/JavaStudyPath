package com.youxiu.liyouxiu.algorithm;

import java.util.Arrays;

//插入排序
/*在其实现过程使用双层循环，外层循环对除了第一个元素之外的所有元素，
 内层循环对当前元素前面有序表进行待插入位置查找，并进行移动*/
public class Code04_InsertionSort {

    public static void main(String[] args) {
        int[] arr = {12, 5, 1, 8, 9, 15};
        Code04_InsertionSort.insertionSort(arr);
    }

    public static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            //第一次 j = 0  0 >= 0 && arr[0] > arr[1] j --
            //当前数 换到比左边不能在小时停止
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                Code04_InsertionSort.swap(arr, j, j + 1);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int j, int i) {
        arr[i] = arr[j] ^ arr[i];
        arr[j] = arr[j] ^ arr[i];
        arr[i] = arr[j] ^ arr[i];
    }
}
