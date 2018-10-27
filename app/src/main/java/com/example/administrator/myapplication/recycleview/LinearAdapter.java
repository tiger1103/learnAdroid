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


public class LinearAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private OnItemClickListener mItemClickListener;
    public LinearAdapter(Context context,OnItemClickListener listener){
        this.context=context;
        mItemClickListener = listener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType==0){
            return new LinearViewHolder(LayoutInflater.from(this.context)
                    .inflate(R.layout.layout_linear_item,parent,false));
        }else{
            return new LineraViewHolder2(LayoutInflater.from(this.context)
                    .inflate(R.layout.layout_linear_item_2,parent,false));
        }

    }

    @Override
    public int getItemViewType(int position) {
        if(position%2!=0){
            return 0;
        }else{
            return 1;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        if(getItemViewType(position)==0){
            ( (LinearViewHolder)viewHolder).textView.setText("hello word");
        }else{
            ( (LineraViewHolder2)viewHolder).textView.setText("我也是醉了");
        }
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
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

    class LinearViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.rv_tv_title);
        }
    }

    class LineraViewHolder2 extends RecyclerView.ViewHolder{
        private TextView textView;
        private ImageView imageView;
        public LineraViewHolder2(@NonNull View ItemView){
            super(ItemView);
            textView = ItemView.findViewById(R.id.rv_tv_title);
            imageView = ItemView.findViewById(R.id.rv_tv_image);
        }
    }

    public interface OnItemClickListener{
        void onclick(int pos);
    }
}
