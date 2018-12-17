package com.example.administrator.myapplication.fragment;


import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.myapplication.R;


public class AFragment extends Fragment {
    private Button mBtnMessage;
    private IOMessageClick listener;
    public static AFragment newInstance(String title){
        AFragment aFragment = new AFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title",title);
        aFragment.setArguments(bundle);
        return aFragment;
    }
    private TextView mTvTitle;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a,container,false);
        return view;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTvTitle = view.findViewById(R.id.tv_title);
        mBtnMessage = view.findViewById(R.id.btn_message);
        mBtnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick("你好呀。");
            }
        });
        if(getArguments()!=null) {
            mTvTitle.setText(getArguments().getString("title"));
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            listener = (IOMessageClick) context;
        }catch (ClassCastException e){
            throw new ClassCastException("Activity 必须实现IOMessageClick接口");
        }
    }

    public interface IOMessageClick{
        void onClick(String text);
    }
}
