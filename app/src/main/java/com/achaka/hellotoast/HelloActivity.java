package com.achaka.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {

    private TextView mCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        mCount = findViewById(R.id.current_count);
        Intent intent = getIntent();
        int count = intent.getIntExtra(MainActivity.COUNT_EXTRA, 0);
        showCount(count);
    }

    private void showCount(int count) {
        if (mCount != null) {
            mCount.setText(String.valueOf(count));
        }
    }
}