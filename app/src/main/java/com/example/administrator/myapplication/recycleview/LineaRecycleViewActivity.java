package com.example.administrator.myapplication.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.administrator.myapplication.R;

public class LineaRecycleViewActivity extends AppCompatActivity {

    private RecyclerView mRvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linea_recycle_view);
        mRvMain = findViewById(R.id.rv_main);
    }
}
