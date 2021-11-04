package com.achaka.hellotoast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button mZeroButton;
    private Button mCountButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
        mZeroButton = findViewById(R.id.button_zero);
        mCountButton = findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @SuppressLint("SetTextI18n")
    public void countUp(View view) {
        ++mCount;
        mZeroButton.setBackgroundColor(getColor(R.color.orange_dark));
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
            if ((mCount % 2) == 0)
                view.setBackgroundColor(getColor(R.color.coral));
            else
                view.setBackgroundColor(getColor(R.color.blue));
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @SuppressLint("SetTextI18n")
    public void resetCounter(View view) {
        mZeroButton.setBackgroundColor(getColor(R.color.gray));
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        mCountButton.setBackgroundColor(getColor(R.color.design_default_color_primary));
    }
}