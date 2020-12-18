package com.example.androidviewtest;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.NonNull;

/**
 * 类描述
 *
 * @author HB.yangzuozhe
 * @date 2020-12-18
 */
public class ItemDialog extends Dialog {
    public ItemDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.item_dialog);
    }

    @Override
    protected void onStart() {
        super.onStart();
        //下面这段代码可以让对话框出现在底部
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams params = window.getAttributes();
            params.width = WindowManager.LayoutParams.WRAP_CONTENT;
            params.height = WindowManager.LayoutParams.WRAP_CONTENT;
            window.setAttributes(params);
            params.dimAmount = 0.0f;

        }
    }
}
