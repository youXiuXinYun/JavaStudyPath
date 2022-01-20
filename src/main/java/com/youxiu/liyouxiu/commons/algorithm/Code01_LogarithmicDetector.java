package com.youxiu.liyouxiu.commons.algorithm;

import com.youxiu.liyouxiu.algorithm.Code04_InsertionSort;

import java.util.Arrays;
/**
* 对数器 （随机样本产生器）
* @author Liyuqing
* @date 2022/1/20 14:02
*/
public class Code01_LogarithmicDetector {

    //测试次数
    public static final long NUMBER_OF_TIMES = 500000L;

    public static final int maxSize = 100;
    public static final int maxValue = 100;
    public static boolean succeed = true;

    public static void main(String[] args) {

        //int[] arr = new int[(int) ((maxSize + 1) * Math.random())];

        Code01_LogarithmicDetector.logarithmicDetector();
    }

    public static void logarithmicDetector() {

        for (long i = 0; i < NUMBER_OF_TIMES; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = Arrays.copyOf(arr1, arr1.length);
            Code04_InsertionSort.insertionSort(arr1);
            Arrays.sort(arr2);
            if (!Arrays.equals(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "ok" : "Fuck");

    }

    /**
     * 产生随机数组和随机数
     *
     * @param maxSize ：数组的最大长度
     * @param maxValue  ：数组的最大随机值
     * @return int[] 返回随机数组
     * @author Liyuqing
     * @date 2022/1/20 13:52
     */
    private static int[] generateRandomArray(int maxSize, int maxValue) {

        //Math.random() -> [0,1) 所有小数,等概率返回一个
        //Math.random() * N -> [0,N) 所有小数，等概率返回一个
        //(int)(Math.random() * N) -> [0,N-1] 所有的整数返回一个

        //随机数组长度
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];

        //随机数组里的值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }

        return arr;
    }


}
