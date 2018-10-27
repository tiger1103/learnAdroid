package com.example.administrator.myapplication.recycleview;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Toast;

import com.example.administrator.myapplication.R;

public class PuRecycleViewActivity extends AppCompatActivity {
    private RecyclerView puRecycleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pu_recycle_view);
        puRecycleView = findViewById(R.id.rv_pu);
        puRecycleView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        puRecycleView.addItemDecoration(new MyDecoration());
        puRecycleView.setAdapter(new StaggeredGridadapter(this, new StaggeredGridadapter.OnItemClickListener() {
            @Override
            public void onclick(int pos) {
                Toast.makeText(PuRecycleViewActivity.this,"click postion="+pos,Toast.LENGTH_SHORT).show();
            }
        }));
    }

    class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            int gap = getResources().getDimensionPixelSize(R.dimen.dividerHeight2);
            outRect.set(gap,gap,gap,gap);
        }
    }
}
