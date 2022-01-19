package com.youxiu.liyouxiu.algorithm;

//题目一: 一个数组中只有一种数出现基数次其他数出现偶数词如何找出出现基数词的数？
//题目二: 一个数组中两种数出现了基数次其他数出现了偶数次如何找到这两种数?
public class Code03_Practice {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 78, 78, 56, 3,45};
        //Code03_Practice01(arr);
        Code03_Practice02(arr);
    }


    //题目一: 一个数组中只有一种数出现基数次其他数出现偶数词如何找出出现基数词的数？
    public static void Code03_Practice01(int arr[]) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a = a ^ arr[i];
        }
        System.out.println(a);
    }


    //题目二: 一个数组中两种数出现了基数次其他数出现了偶数次如何找到这两种数? (a  / b)
    public static void Code03_Practice02(int arr[]){
        int eor = 0;
        for (int i : arr) {
            eor ^= i;
        }

        int onlyOne = 0;

        int rightOne = eor & (~eor + 1);

        for (int cur : arr) {
            if ((cur & rightOne) == 0){
                onlyOne ^= cur;
            }
        }

        System.out.println(onlyOne + ":" + (onlyOne ^ eor));
    }

   /*
   * eor & (~eor + 1); 解析
   *            eor : 1 0 0 1 1 1 0 0 1 0
   *           ~eor : 0 1 1 0 0 0 1 1 0 1
   *        ~eor + 1: 0 1 1 0 0 0 1 1 1 0
   * eor & ~eor + 1 : 0 0 0 0 0 0 0 0 1 0
   *
   * 这样就找到 最位的 1 了
   * */
}
