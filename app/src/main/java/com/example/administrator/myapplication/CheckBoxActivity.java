package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {
    private CheckBox checkBox5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        checkBox5 = findViewById(R.id.cb_5);
        checkBox5.setOnCheckedChangeListener((buttonView,isChecked)->{
            Toast.makeText(CheckBoxActivity.this,isChecked?"选中":"未选中",Toast.LENGTH_SHORT).show();
        });
    }
}
