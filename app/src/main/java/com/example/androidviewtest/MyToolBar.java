package com.example.androidviewtest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;

/**
 * 类描述
 *
 * @author HB.yangzuozhe
 * @date 2020-12-18
 */
public class MyToolBar extends LinearLayout {
    FrameLayout myFrame;
    Toolbar customToolbar;
    public MyToolBar(@NonNull Context context) {
        this(context, null);
    }

    public MyToolBar(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyToolBar(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(getContext()).inflate(R.layout.my_toolbar, this);
        myFrame = findViewById(R.id.myFrame);
        customToolbar = findViewById(R.id.customToolbar);
        customToolbar.setNavigationOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ItemView itemView = new ItemView(getContext());
                LayoutParams layoutParams = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                itemView.setLayoutParams(layoutParams);
                myFrame.addView(itemView);
            }
        });

    }




}
