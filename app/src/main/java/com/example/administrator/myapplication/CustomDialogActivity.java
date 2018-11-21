package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.myapplication.util.ToastUtil;
import com.example.administrator.myapplication.widget.CustomDialog;

public class CustomDialogActivity extends AppCompatActivity {
    private Button mBtnCustomDialg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog);
        mBtnCustomDialg = findViewById(R.id.btn_custom_dialog);
        mBtnCustomDialg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomDialog customDialog = new CustomDialog(CustomDialogActivity.this,R.style.CustomDialog);
                customDialog.setTitle("提示").setMessage("确认要删除吗？").setCancle("取消", new CustomDialog.IOnCancelListener() {
                    @Override
                    public void onCancel() {
                        ToastUtil.showMsg(getApplicationContext(),"点击了取消");
                    }
                }).setConfirm("确认", new CustomDialog.IOnConfirmListener() {
                    @Override
                    public void onConfirm() {
                        ToastUtil.showMsg(getApplicationContext(),"点击了确认");
                    }
                }).show();
            }
        });
    }
}
