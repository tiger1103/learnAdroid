package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {
    private ImageView imageView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        imageView4 = findViewById(R.id.iv_4);
        Glide.with(this).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1540439958792&di=a38bd6a24b5410c5ebb52048cc034fb5&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fbaike%2Fwhfpf%253D268%252C362%252C50%2Fsign%3D7c9957f10ff41bd5da06bbb437e7b3fd%2F9a504fc2d5628535e45a62fb91ef76c6a6ef63b5.jpg").into(imageView4);
    }
}
