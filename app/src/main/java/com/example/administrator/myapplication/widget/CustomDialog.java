package com.example.administrator.myapplication.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.administrator.myapplication.R;


public class CustomDialog extends Dialog implements View.OnClickListener {
    private TextView mTvTitle,mTvMessage,mTvCancle,mTvConfirm;
    private String title,message,cancle,confirm;
    private IOnCancelListener cancelListener;
    private IOnConfirmListener confirmListener;

    public CustomDialog setTitle(String title) {
        this.title = title;
        return this;
    }

    public CustomDialog setMessage(String message) {
        this.message = message;
        return this;
    }

    public CustomDialog setCancle(String cancle,IOnCancelListener cancleListener) {
        this.cancle = cancle;
        this.cancelListener = cancleListener;
        return this;
    }

    public CustomDialog setConfirm(String confirm,IOnConfirmListener confirmListener) {
        this.confirm = confirm;
        this.confirmListener = confirmListener;
        return this;
    }


    public CustomDialog(@NonNull Context context) {
        super(context);
    }

    public CustomDialog(@NonNull Context context,int themeId){
        super(context,themeId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_custom_dialog);
        //设置宽度
        WindowManager windowManager = getWindow().getWindowManager();
        Display d = windowManager.getDefaultDisplay();
        WindowManager.LayoutParams p = getWindow().getAttributes();
        Point size = new Point();
        d.getSize(size);
        p.width = (int)(size.x*0.8);//设置dialog的宽度为当前屏幕的80%
        getWindow().setAttributes(p);
        mTvTitle = findViewById(R.id.tv_title);
        mTvMessage = findViewById(R.id.tv_message);
        mTvCancle = findViewById(R.id.tv_cancel);
        mTvConfirm = findViewById(R.id.tv_confirm);
        if(!TextUtils.isEmpty(title)){
            mTvTitle.setText(title);
        }
        if(!TextUtils.isEmpty(message)){
            mTvMessage.setText(message);
        }
        if(!TextUtils.isEmpty(cancle)){
            mTvCancle.setText(cancle);
        }
        if(!TextUtils.isEmpty(confirm)){
            mTvConfirm.setText(confirm);
        }
        mTvCancle.setOnClickListener(this);
        mTvConfirm.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_cancel:
                if(this.cancelListener!=null){
                    this.cancelListener.onCancel();
                    dismiss();
                }
                break;
            case R.id.tv_confirm:
                if(this.confirmListener!=null){
                    this.confirmListener.onConfirm();
                    dismiss();
                }
                break;
        }
    }

    public interface IOnCancelListener{
        void onCancel();
    }

    public interface IOnConfirmListener{
        void onConfirm();
    }
}
