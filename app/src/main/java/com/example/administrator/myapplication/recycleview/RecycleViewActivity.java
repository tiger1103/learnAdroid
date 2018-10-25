package com.example.administrator.myapplication.recycleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.administrator.myapplication.R;

public class RecycleViewActivity extends AppCompatActivity {

    private Button btnLinea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        btnLinea = findViewById(R.id.btn_linear);
        btnLinea.setOnClickListener((v)->{
            Intent intent = new Intent(RecycleViewActivity.this,LineaRecycleViewActivity.class);
            startActivity(intent);
        });
    }
}
