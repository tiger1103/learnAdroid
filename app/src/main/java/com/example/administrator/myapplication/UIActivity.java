package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.myapplication.gridview.GridViewActivity;
import com.example.administrator.myapplication.listview.ListViewActivity;
import com.example.administrator.myapplication.recycleview.RecycleViewActivity;

public class UIActivity extends AppCompatActivity {
    private Button btnButton,btnEditText,btnRadioButton,btnCheckBox
            ,btnImageView,btnListView,btnGridView,btnRecycleView,btnWebView
            ,btnToast,btnDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_activity_main);
        btnButton = findViewById(R.id.btn_button);
        btnEditText = findViewById(R.id.btn_edit_text);
        btnRadioButton = findViewById(R.id.btn_radio_button);
        btnCheckBox = findViewById(R.id.btn_checkBox);
        btnImageView = findViewById(R.id.btn_imageView);
        btnListView = findViewById(R.id.btn_listView);
        btnGridView = findViewById(R.id.btn_gridView);
        btnRecycleView = findViewById(R.id.btn_recycleView);
        btnWebView = findViewById(R.id.btn_webView);
        btnToast = findViewById(R.id.btn_toast);
        btnDialog = findViewById(R.id.btn_dialog);
        //创建事件对象
        setListeners();
    }

    private void setListeners() {
        Onclick onclick = new Onclick();
        btnButton.setOnClickListener(onclick);
        btnEditText.setOnClickListener(onclick);
        btnRadioButton.setOnClickListener(onclick);
        btnCheckBox.setOnClickListener(onclick);
        btnImageView.setOnClickListener(onclick);
        btnListView.setOnClickListener(onclick);
        btnGridView.setOnClickListener(onclick);
        btnRecycleView.setOnClickListener(onclick);
        btnWebView.setOnClickListener(onclick);
        btnToast.setOnClickListener(onclick);
        btnDialog.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_button:
                    //跳转到button演示界面
                    intent = new Intent(UIActivity.this,ButtonActivity.class);
                    break;
                case R.id.btn_edit_text:
                    //跳转到EditText演示界面
                    intent = new Intent(UIActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_radio_button:
                    //跳转到RadioButton演示界面
                    intent = new Intent(UIActivity.this,RadioButtonActivity.class);
                    break;
                case R.id.btn_checkBox:
                    //跳转到CheckBox演示界面
                    intent = new Intent(UIActivity.this,CheckBoxActivity.class);
                    break;
                case R.id.btn_imageView:
                    //跳转到ImageView演示界面
                    intent = new Intent(UIActivity.this,ImageViewActivity.class);
                    break;
                case R.id.btn_listView:
                    //跳转到ListView演示界面
                    intent = new Intent(UIActivity.this,ListViewActivity.class);
                    break;
                case R.id.btn_gridView:
                    //跳转到GridView演示界面
                    intent = new Intent(UIActivity.this,GridViewActivity.class);
                    break;
                case R.id.btn_recycleView:
                    //跳转到RecycleView演示界面
                    intent = new Intent(UIActivity.this,RecycleViewActivity.class);
                    break;
                case R.id.btn_webView:
                    //跳转到WebView演示界面
                    intent = new Intent(UIActivity.this,WebViewActivity.class);
                    break;
                case R.id.btn_toast:
                    //跳转到Toast演示界面
                    intent = new Intent(UIActivity.this,ToastViewActivity.class);
                    break;
                case R.id.btn_dialog:
                    //跳转到Dialog演示界面
                    intent = new Intent(getApplicationContext(),DialogActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}