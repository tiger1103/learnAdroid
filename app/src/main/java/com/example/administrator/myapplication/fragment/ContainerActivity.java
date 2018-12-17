package com.example.administrator.myapplication.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.myapplication.R;

public class ContainerActivity extends AppCompatActivity implements AFragment.IOMessageClick {
    private AFragment aFragment;
    private BFragment bFragment;
    private Button mBtnChange;
    private TextView mTvTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        mTvTitle = findViewById(R.id.tv_title);
        mBtnChange = findViewById(R.id.btn_change);
        mBtnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bFragment==null){
                    bFragment = new BFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container,bFragment).commitAllowingStateLoss();
            }
        });
        //实例化AFragment
        //aFragment = new AFragment();
        aFragment = AFragment.newInstance("我是参数");
        //把AFragment添加到Activity中
        getSupportFragmentManager().beginTransaction().add(R.id.fl_container,aFragment).commitAllowingStateLoss();
    }

    @Override
    public void onClick(String text) {
        mTvTitle.setText(text);
    }
}
