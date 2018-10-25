package com.example.administrator.myapplication.gridview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.administrator.myapplication.R;

public class GridViewActivity extends AppCompatActivity {
    private GridView gridView1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        gridView1 = findViewById(R.id.gv_1);
        gridView1.setAdapter(new MyGridViewAdapter(GridViewActivity.this));
        gridView1.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(GridViewActivity.this,"点击：position:"+position,Toast.LENGTH_SHORT).show();
        });

        gridView1.setOnItemLongClickListener((parent, view, position, id) -> {
            Toast.makeText(GridViewActivity.this,"长按：position:"+position,Toast.LENGTH_SHORT).show();
            return true;
        });
    }
}
