package com.tt.commonarithmetic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tt.commonarithmetic.search.SearchActivity;
import com.tt.commonarithmetic.sort.SortActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sort(View view) {
        Intent intent = new Intent(this, SortActivity.class);
        startActivity(intent);
    }

    public void search(View view) {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }
}
