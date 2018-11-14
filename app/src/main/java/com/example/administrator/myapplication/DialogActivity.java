package com.example.administrator.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.administrator.myapplication.util.ToastUtil;

public class DialogActivity extends AppCompatActivity {
    private Button mBtnDialog1,mBtnDialog2,mBtnDialog3,mBtnDialog4,mBtnDialog5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        mBtnDialog1 = findViewById(R.id.btn_dialog1);
        mBtnDialog2 = findViewById(R.id.btn_dialog2);
        mBtnDialog3 = findViewById(R.id.btn_dialog3);
        mBtnDialog4 = findViewById(R.id.btn_dialog4);
        mBtnDialog5 = findViewById(R.id.btn_dialog5);
        Onclick onclick = new Onclick();
        mBtnDialog1.setOnClickListener(onclick);
        mBtnDialog2.setOnClickListener(onclick);
        mBtnDialog3.setOnClickListener(onclick);
        mBtnDialog4.setOnClickListener(onclick);
        mBtnDialog5.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener{
        boolean[] booleans4 = new boolean[]{false, false, true};
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_dialog1:
                    AlertDialog.Builder builder = new AlertDialog.Builder(DialogActivity.this);
                    builder.setTitle("请回答：").setMessage("你感觉如何？")
                            .setIcon(R.drawable.pwd)
                            .setPositiveButton("棒", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    ToastUtil.showMsg(DialogActivity.this,"的确棒");
                                }
                            }).setNeutralButton("还行", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this,"的确还行");
                        }
                    }).setNegativeButton("不咋地", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this,"背时了");
                        }
                    }).show();

                    break;
                case R.id.btn_dialog2:
                    final String[] array2 = new String[]{"男" ,"女"};
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(DialogActivity.this);
                    builder2.setTitle("请选择性别").setItems(array2, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this,array2[which]);
                        }
                    }).show();
                    break;
                case R.id.btn_dialog3:
                    final String[] array3 = new String[]{"男" ,"女"};
                    AlertDialog.Builder builder3 = new AlertDialog.Builder(DialogActivity.this);
                    builder3.setTitle("请选择性别").setSingleChoiceItems(array3,1, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToastUtil.showMsg(DialogActivity.this,array3[which]);
                            dialog.dismiss();
                        }
                    }).setCancelable(false).show();
                    break;
                case R.id.btn_dialog4:
                    String[] array4  = new String[]{"唱歌","跳舞","写代码"};
                    AlertDialog.Builder builder4 = new AlertDialog.Builder(DialogActivity.this);
                    builder4.setTitle("请选择爱好").setMultiChoiceItems(array4,booleans4 , new DialogInterface.OnMultiChoiceClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                            booleans4[which] = isChecked;
                            ToastUtil.showMsg(DialogActivity.this,array4[which]+":"+isChecked);
                        }
                    }).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).setNeutralButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).show();
                    break;
                case R.id.btn_dialog5:
                    AlertDialog.Builder builder5 = new AlertDialog.Builder(DialogActivity.this);
                    View view = LayoutInflater.from(DialogActivity.this).inflate(R.layout.layout_dialog,null);
                    EditText username = view.findViewById(R.id.dialog_username);
                    EditText password = view.findViewById(R.id.dialog_password);
                    Button loginBtn = view.findViewById(R.id.dialog_btn_login);
                    int b  = 12;
                    loginBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ToastUtil.showMsg(DialogActivity.this,
                                    username.getText().toString()+password.getText().toString()+String.valueOf(b));
                        }
                    });
                    builder5.setTitle("请登陆").setView(view).show();
                    break;
            }
        }
    }
}
