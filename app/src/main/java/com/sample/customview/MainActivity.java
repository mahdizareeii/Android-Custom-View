package com.sample.customview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sample.customview.customView.ButtonTextProgress;

public class MainActivity extends AppCompatActivity {

    private ButtonTextProgress buttonTextProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonTextProgress = findViewById(R.id.buttonTextProgress);
    }
}
