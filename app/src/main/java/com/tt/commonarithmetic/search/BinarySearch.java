package com.tt.commonarithmetic.search;

/**
 * 二分查找
 * 每次拿到中间的数，判断是否为要查找的数字，然后一分为2，递归查找
 * Created by Kyson on 2016/3/2.
 */
public class BinarySearch {

    public static int binarySearch(int[] array, int value) {
        final int lo = 0;
        final int hi = array.length - 1;
        return binarySearch(array, lo, hi, value);
    }

    private static int binarySearch(int[] array, int lo, int hi, int value) {
        if (lo > hi) {
            return -1;
        }
        final int mid = lo + hi >>> 1;
        final int midValue = array[mid];
        if (midValue == value) {
            return mid;
        } else if (midValue < value) {
            lo = mid + 1;
        } else {
            hi = mid - 1;
        }
        return binarySearch(array, lo, hi, value);
    }
}
