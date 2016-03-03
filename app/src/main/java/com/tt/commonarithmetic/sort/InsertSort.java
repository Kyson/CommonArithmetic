package com.tt.commonarithmetic.sort;

/**
 * 插入排序
 * 每一次认为前N个数字是排好序的，拿出第N+1个数字，在前N个数字中找到自己的位置插进去即可，一共要拿出size-1个数字
 * Created by Kyson on 2016/2/27.
 */
public class InsertSort {

    public static void insertSort(int[] array) {
        final int size = array.length;
        for (int i = 1; i < size; i++) {
            //当前需要插入的数字
            final int current = array[i];
            int insertIndex = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > current) {
                    //如果后面的数字大于当前需要插入的数字，就把这个数往后挪一个
                    //一直挪到我当前插入数字的index上
                    array[j + 1] = array[j];
                } else {
                    //一样大或者比插入数字小的话，就每次记录一下，记到最后一个的时候就是需要插入的位置的前一个
                    insertIndex = j + 1;
                    //第一次找到比要插入数字小就跳出
                    break;
                }
            }
            //找到插入位置之后插入那个位置
            //如果是要插入的数字是最小的，那么insertIndex就是-1（else语句一次都没执行到），如果是最大的，那么insertIndex就是i-1，就是else每次都执行到了
            array[insertIndex] = current;
        }
    }

}
