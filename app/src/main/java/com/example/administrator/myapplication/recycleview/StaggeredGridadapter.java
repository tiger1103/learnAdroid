package com.example.administrator.myapplication.recycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;


public class StaggeredGridadapter extends RecyclerView.Adapter<StaggeredGridadapter.GridViewHolder> {
    private Context context;
    private OnItemClickListener mItemClickListener;
    public StaggeredGridadapter(Context context, OnItemClickListener listener){
        this.context=context;
        mItemClickListener = listener;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GridViewHolder(LayoutInflater.from(this.context)
                .inflate(R.layout.layout_staggered_grid_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder viewHolder, int position) {
        if(position%2!=0) {
            viewHolder.imageView.setImageResource(R.drawable.pu1);
        }else{
            viewHolder.imageView.setImageResource(R.drawable.pu2);
        }
        viewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mItemClickListener.onclick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 50;
    }

    class GridViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.rv_iv_staggered);
        }
    }

    public interface OnItemClickListener{
        void onclick(int pos);
    }
}
