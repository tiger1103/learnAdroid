package com.example.administrator.myapplication.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.administrator.myapplication.R;

public class GridRecycleViewActivity extends AppCompatActivity {
    private RecyclerView gridRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_recycle_view);
        gridRecyclerView = findViewById(R.id.rv_grid);
        gridRecyclerView.setLayoutManager(new GridLayoutManager(this,3));
        gridRecyclerView.setAdapter(new Gridadapter(this,new Gridadapter.OnItemClickListener(){
            @Override
            public void onclick(int pos) {
                Toast.makeText(GridRecycleViewActivity.this,"click position="+pos,Toast.LENGTH_SHORT).show();
            }
        }));
    }
}
