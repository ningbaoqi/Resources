package com.example.ningbaoqi.resources;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取字符串数组资源
        String[] stringArray = getResources().getStringArray(R.array.strings_array);

        //获取整数数组资源
        int[] intArray = getResources().getIntArray(R.array.integer_arrays);

        //获取普通数组资源
        TypedArray typedArray = getResources().obtainTypedArray(R.array.mipmap_array);
        ImageView iv1 = new ImageView(this);
        iv1.setImageDrawable(typedArray.getDrawable(0));
        typedArray.recycle();
    }
}
