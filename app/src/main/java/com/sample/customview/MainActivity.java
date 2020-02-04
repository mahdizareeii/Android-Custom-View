package com.sample.customview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.sample.customview.customView.ButtonTextProgress;

public class MainActivity extends AppCompatActivity {

    private ButtonTextProgress buttonTextProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initAction();
    }

    private void initView() {
        buttonTextProgress = findViewById(R.id.buttonTextProgress);
    }

    private void initAction() {
        /*
        buttonTextProgress.setBtnConfirmText("Test1");
        buttonTextProgress.setTxtTitleText("Test2");
        buttonTextProgress.setProgressBarVisibility(View.GONE);
        */
    }
}
