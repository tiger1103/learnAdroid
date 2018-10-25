package com.example.administrator.myapplication.listview;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;
import android.widget.Toast;

import com.example.administrator.myapplication.R;

public class ListViewActivity extends Activity {
    private ListView lv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        lv1 = findViewById(R.id.lv_1);
        lv1.setAdapter(new MyListAdapter(ListViewActivity.this));
        lv1.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(ListViewActivity.this,"点击position:"+position+"；id:"+id,Toast
                    .LENGTH_SHORT)
                    .show();
        });

        lv1.setOnItemLongClickListener((parent, view, position, id) -> {
            Toast.makeText(ListViewActivity.this,"长按position:"+position+"；id:"+id,Toast
                    .LENGTH_SHORT)
                    .show();
            return false;
        });
    }
}
