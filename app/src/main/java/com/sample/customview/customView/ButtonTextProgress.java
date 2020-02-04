package com.sample.customview.customView;

import android.content.Context;
import android.content.res.TypedArray;
import android.opengl.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.sample.customview.R;

public class ButtonTextProgress extends LinearLayout {

    private ButtonTextProgressModel model;
    private Button btnConfirm;
    private TextView txtTitle;
    private ProgressBar progressBar;

    public ButtonTextProgress(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        View view = inflate(context, R.layout.button_text_progress, this);
        getAttr(context, attrs);
        initView(view);
        initAction();
    }

    private void getAttr(Context context, AttributeSet attributeSet) {
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.ButtonTextProgress, 0, 0);
        try {
            model = new ButtonTextProgressModel(
                    typedArray.getString(R.styleable.ButtonTextProgress_setTxtConfirm),
                    typedArray.getString(R.styleable.ButtonTextProgress_setTxtTitle),
                    typedArray.getInt(R.styleable.ButtonTextProgress_setProgressVisibility, 0)
            );

        } finally {
            typedArray.recycle();
        }
    }

    private void initView(View view) {
        btnConfirm = view.findViewById(R.id.btnConfirm);
        txtTitle = view.findViewById(R.id.txtTitle);
        progressBar = view.findViewById(R.id.progressBar);
    }

    //init views from xml
    private void initAction() {
        btnConfirm.setText(model.getTxtConfirm());
        txtTitle.setText(model.getTxtTitle());
        switch (model.getVisibility()) {
            case 0: {
                progressBar.setVisibility(VISIBLE);
            }
            break;

            case 1: {
                progressBar.setVisibility(INVISIBLE);
            }
            break;

            case 2: {
                progressBar.setVisibility(GONE);
            }
            break;
        }
    }


    //init views from java
    public void setBtnConfirmText(String text) {
        btnConfirm.setText(text);
    }

    public void setTxtTitleText(String text) {
        txtTitle.setText(text);
    }

    public void setProgressBarVisibility(int visibility) {
        progressBar.setVisibility(visibility);
    }
}
