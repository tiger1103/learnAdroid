package com.example.administrator.myapplication.recycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.myapplication.R;


public class Gridadapter extends RecyclerView.Adapter<Gridadapter.GridViewHolder> {
    private Context context;
    private OnItemClickListener mItemClickListener;
    public Gridadapter(Context context, OnItemClickListener listener){
        this.context=context;
        mItemClickListener = listener;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GridViewHolder(LayoutInflater.from(this.context)
                .inflate(R.layout.layout_grid_recycleview_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder viewHolder, int position) {
        viewHolder.textView.setText("hello word");
        viewHolder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mItemClickListener.onclick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class GridViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.rv_grid_title);
        }
    }

    public interface OnItemClickListener{
        void onclick(int pos);
    }
}
