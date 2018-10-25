package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {
    private Button btn3;
    private TextView tv_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        btn3 = findViewById(R.id.btn_3);
        btn3.setOnClickListener((v)->{
            Toast.makeText(ButtonActivity.this,"点击了按钮3",Toast.LENGTH_SHORT).show();
        });
        tv_1 = findViewById(R.id.tv_1);
        tv_1.setOnClickListener((v)->{
            Toast.makeText(ButtonActivity.this,"点击了textView tv_1",Toast.LENGTH_SHORT).show();
        });
    }

    public void showToast(View view) {
        Toast.makeText(this,"点击了按钮4",Toast.LENGTH_SHORT).show();
    }
}
