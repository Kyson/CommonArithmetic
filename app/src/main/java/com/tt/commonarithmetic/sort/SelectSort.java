package com.tt.commonarithmetic.sort;

/**
 * 选择排序
 * 每一趟选出一个最大数字放最后，每一趟把前面的N个数找到最大数放最后
 * Created by Kyson on 2016/2/27.
 */
public class SelectSort {

    /**
     * 假设数组大小为3，每一次能找到一个最大数，一共要2趟，每一趟需要跑size-n次
     *
     * @param array
     */
    public static void selectSort(int[] array) {
        final int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            //假设一开始最大数字为第0个
            int maxIndex = 0;
            for (int j = 1; j < size - i; j++) {//第一趟需要全部遍历一下
                if (array[j] > array[maxIndex]) {//如果找到更大的数字，则赋值maxIndex
                    maxIndex = j;
                }
            }
            //等全部跑完，我就知道谁是这趟最大的数字，然后放列表最后
            //列表最后一个的index为size-i-1
            final int lastIndex = size - i - 1;
            //交换最大值和数组最后的值
            final int temp = array[maxIndex];
            array[maxIndex] = array[lastIndex];
            array[lastIndex] = temp;
        }
    }


}
