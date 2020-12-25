package com.example.androidviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.google.android.material.appbar.AppBarLayout;

public class ToolbarWidthAppBarLayoutActivity extends AppCompatActivity {
    AppBarLayout myAppBar;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar_width_appbarlayout);
        toolbar = findViewById(R.id.myToolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog dialog = new MyDialog(ToolbarWidthAppBarLayoutActivity.this);
                dialog.show();
            }
        });

        //获得 DecorView
        FrameLayout view = (FrameLayout) getWindow().getDecorView();
        //获得 DecorView 里的LinearLayout
        LinearLayout linearLayout = (LinearLayout) view.getChildAt(0);
        Log.d("Demo", linearLayout.toString());

        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            Log.d("Demo",linearLayout.getChildAt(i).toString());
        }
    }


}