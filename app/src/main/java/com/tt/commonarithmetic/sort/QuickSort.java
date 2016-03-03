package com.tt.commonarithmetic.sort;

/**
 * 快速排序
 * 每一趟把比基准数小的数字放左边，大的放右边，递归调用
 * Created by Kyson on 2016/2/27.
 */
public class QuickSort {

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }


    public static void quickSort(int[] array, int lo, int hi) {
        //如果当前一趟的lo大于或者等于hi了，就不需要进行此次排序了
        if (lo >= hi) {
            return;
        }
        //找到基准数中心
        int mid = quickMid(array, lo, hi);
        //以中心为界，分别对两边数组执行同样的操作
        quickSort(array, lo, mid - 1);
        quickSort(array, mid + 1, hi);
    }

    /**
     * 一趟排序，以第一个数为基准数，小的数字排左边，大的数字排右边
     *
     * @param array
     * @param lo
     * @param hi
     * @return 基准数的index
     */
    public static int quickMid(int[] array, int lo, int hi) {
        //拿出基准数
        final int pivot = array[lo];
        //两个指针，一个从左往右，一个从右往左，直到lo比hi的index高或相等为止，事实上只能相等
        while (lo < hi) {
            //hi从右往左遍历，直到找到比基准数小的为止
            while (lo < hi && array[hi] >= pivot) {
                hi--;
            }
            //找到小的值，填到lo所在的坑里去
            //所谓坑，就是说当前指向的数是多余的，需要被其他需要的数字填进去的
            array[lo] = array[hi];

            //lo从左往右遍历，找到比基准数大的为止
            while (lo < hi && array[lo] <= pivot) {
                lo++;
            }
            //找到之后填充到hi指向的坑
            array[hi] = array[lo];
        }
        //全部填完之后，把基准数放在当前lo和hi指向的那个坑上去
        array[lo] = pivot;
        //当前两个指针的指向就是基准数的index
        return lo;
    }
}
