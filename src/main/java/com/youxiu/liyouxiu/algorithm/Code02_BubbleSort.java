package com.youxiu.liyouxiu.algorithm;

import java.util.Arrays;

//冒泡排序
public class Code02_BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 6, 10, 2, 3, 1, 5, 44, 2};
        Code02_BubbleSort.bubbling(arr);
    }

    // 找出最大放在右边
    public static void bubbling(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    Code02_BubbleSort.swap(arr, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    /*
     * ^ 运算 满足 (结合律 和 交换律)
     * int a = 甲;
     * int b = 乙;
     * a = a ^ b = 甲 ^ 乙
     * b = a ^ b = 甲 ^ 乙 ^ 乙
     * a = a ^ b = 甲 ^ 乙 ^ 甲
     *
     * 0 ^ a = a   ： 任何一个数（a） 和0异或运算 都等于  a
     * a ^ a = 0   ： 本身异或运算会抹成 0
     *
     * 地址值不能相同否则会抹成 0
     * */
    private static void swap(int[] arr, int i, int j) {
        //int tem = arr[i];
        //arr[i] = arr[j];
        //arr[j] = tem;

        //  ^ 运算符
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[j] ^ arr[i];
    }
}
