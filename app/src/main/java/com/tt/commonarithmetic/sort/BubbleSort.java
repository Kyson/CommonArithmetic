package com.tt.commonarithmetic.sort;

/**
 * 冒泡排序
 * 每一轮循环，两两比对，右边小，左边大则交换，一趟完毕最大数字会在最右端
 * Created by Kyson on 2016/2/27.
 */
public class BubbleSort {
    /**
     * 如果数组大小为3，则第一趟需要2次比对，N趟需要size-1-n次比对，一趟比对找出一个最大数，一共需要size-1趟
     */
    public static void bubbleSort(int[] array) {
        final int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                //比对前后两个数
                if (array[j] > array[j + 1]) {//前面小后面大则交换
                    final int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
