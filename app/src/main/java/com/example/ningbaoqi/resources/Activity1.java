package com.example.ningbaoqi.resources;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mian1);
        TextView textView = findViewById(R.id.button);
        TransitionDrawable drawable = (TransitionDrawable) textView.getBackground();
        drawable.startTransition(1000);//实现淡入淡出效果
        drawable.reverseTransition(1000);//逆过程
    }
}
