package com.tt.commonarithmetic.search;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.tt.commonarithmetic.R;

public class SearchActivity extends AppCompatActivity {

    private static final int[] ARRAY = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        StringBuilder sb = new StringBuilder();
        for (int i : ARRAY) {
            sb.append(i);
            sb.append(",");
        }
        ((TextView) (this.findViewById(R.id.search_array))).setText(sb.toString());
    }

    public void search(View view) {
        EditText valueEt = (EditText) this.findViewById(R.id.search_value);
        int mid = BinarySearch.binarySearch(ARRAY, Integer.parseInt(String.valueOf(valueEt.getText())));
        ((TextView) (this.findViewById(R.id.search_result))).setText("index:" + String.valueOf(mid));
    }
}
