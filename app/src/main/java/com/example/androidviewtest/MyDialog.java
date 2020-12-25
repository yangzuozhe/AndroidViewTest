package com.example.androidviewtest;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;

import static android.view.WindowManager.LayoutParams.FIRST_APPLICATION_WINDOW;

/**
 * 类描述
 *
 * @author HB.yangzuozhe
 * @date 2020-12-25
 */
public class MyDialog extends Dialog implements View.OnClickListener {
    ImageView gggg;
    LinearLayout llMyDialog;

    public MyDialog(@NonNull Context context) {
        super(context, R.style.MyDialog);
        setContentView(R.layout.image_dialog);
        llMyDialog = findViewById(R.id.llMyDialog);
        llMyDialog.setOnClickListener(this);
        gggg = findViewById(R.id.gggg);
    }

    @Override
    public void show() {
        super.show();
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams params = window.getAttributes();
            params.type = FIRST_APPLICATION_WINDOW;
            params.height = WindowManager.LayoutParams.MATCH_PARENT;
            params.width = WindowManager.LayoutParams.MATCH_PARENT;
            window.setAttributes(params);
            window.setWindowAnimations(R.style.AlphaAnim);
        }
    }


    @Override
    public void onClick(View v) {
        dismiss();
    }
}
