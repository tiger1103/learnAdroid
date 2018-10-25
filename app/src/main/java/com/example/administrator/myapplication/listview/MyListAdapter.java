package com.example.administrator.myapplication.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.myapplication.R;

public class MyListAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    public MyListAdapter(Context context){
        mContext = context;
        mLayoutInflater = LayoutInflater.from(mContext);
    }
    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    class ViewHolder{
        public  ImageView imgView;
        public  TextView tvTitle,tvTime,tvContent;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView==null){
            convertView = mLayoutInflater.inflate(R.layout.layout_list_item,null);
            holder = new ViewHolder();
            holder.imgView = convertView.findViewById(R.id.lvi_1);
            holder.tvTitle = convertView.findViewById(R.id.lv_tv_title);
            holder.tvTime = convertView.findViewById(R.id.lv_tv_time);
            holder.tvContent = convertView.findViewById(R.id.lv_tv_content);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        //给控件赋值
        holder.tvTitle.setText("这是赋值标题");
        holder.tvTime.setText("2020-02-20");
        holder.tvContent.setText("这是赋值后的内容");
        Glide.with(mContext).load("https://www.jb51.net/images/logo.gif").into(holder.imgView);
        return convertView;
    }
}
