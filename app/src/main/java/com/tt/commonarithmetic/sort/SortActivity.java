package com.tt.commonarithmetic.sort;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.tt.commonarithmetic.R;

public class SortActivity extends AppCompatActivity {

    private RadioGroup mSortMode;

    private TextView mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort);
        mSortMode = (RadioGroup) this.findViewById(R.id.sort_mode);
        mResult = (TextView) this.findViewById(R.id.result);
    }

    public void start(View view) {
        final int[] array = new int[]{1, 3, 4, 9, 2, 7, 5, 6, 8, 1, 4, 4, 2, 9, 3};
        mResult.setText("原始数组：" + genArrayStr(array));
        int checkedId = mSortMode.getCheckedRadioButtonId();
        switch (checkedId) {
            case R.id.quick:
                QuickSort.quickSort(array);
                break;
            case R.id.bubble:
                BubbleSort.bubbleSort(array);
                break;
            case R.id.select:
                SelectSort.selectSort(array);
                break;
            case R.id.insert:
                InsertSort.insertSort(array);
                break;
        }
        mResult.append("\n排序数组：" + genArrayStr(array));
    }

    public static String genArrayStr(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            sb.append(i);
        }
        return sb.toString();
    }
}
