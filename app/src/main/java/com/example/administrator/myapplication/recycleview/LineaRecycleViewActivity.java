package com.example.administrator.myapplication.recycleview;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.administrator.myapplication.R;

public class LineaRecycleViewActivity extends AppCompatActivity {

    private RecyclerView mRvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linea_recycle_view);
        mRvMain = findViewById(R.id.rv_main);
        mRvMain.setLayoutManager(new LinearLayoutManager(LineaRecycleViewActivity.this));
        mRvMain.addItemDecoration(new MyDecoration());
        mRvMain.setAdapter(new LinearAdapter(LineaRecycleViewActivity.this, new LinearAdapter.OnItemClickListener() {
            @Override
            public void onclick(int pos) {
                Toast.makeText(LineaRecycleViewActivity.this,"click postion="+pos,Toast.LENGTH_SHORT).show();
            }
        }));

    }

    class MyDecoration extends RecyclerView.ItemDecoration{
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect,view,parent,state);
            outRect.set(0,0,0,getResources().getDimensionPixelOffset(R.dimen.dividerHeight));
        }
    }

}
