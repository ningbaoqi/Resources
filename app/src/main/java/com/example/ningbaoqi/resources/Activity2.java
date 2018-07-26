package com.example.ningbaoqi.resources;

import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.image);
        final ClipDrawable c = (ClipDrawable) imageView.getDrawable();
        final Handler handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                c.setLevel(c.getLevel() + 200);
            }
        };
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0);
                if (c.getLevel() >= 10000) {
                    timer.cancel();
                }
            }
        }, 0, 200);
    }
}
