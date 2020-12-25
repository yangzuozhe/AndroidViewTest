package com.example.androidviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsetsController;
import android.widget.Button;

public class AndroidViewDemoActivity extends AppCompatActivity {
    Button btnOpen;
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_view_demo);
        btnOpen = findViewById(R.id.btnOpen);
        drawerLayout = findViewById(R.id.drawerLayout);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //这里必须要和xml设置的一样
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }
}