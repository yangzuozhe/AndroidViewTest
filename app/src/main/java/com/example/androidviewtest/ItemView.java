package com.example.androidviewtest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

/**
 * 类描述
 *
 * @author HB.yangzuozhe
 * @date 2020-12-18
 */
public class ItemView extends LinearLayout {
    public ItemView(Context context) {
        this(context,null);
    }

    public ItemView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ItemView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(getContext()).inflate(R.layout.item_view,this);
        this.setOrientation(VERTICAL);

    }
}
