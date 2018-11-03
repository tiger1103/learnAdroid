package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class ToastViewActivity extends AppCompatActivity {
    private Button btnToast1,btnToast2,btnToast3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_view);
        btnToast1 = findViewById(R.id.bt_toast_1);
        btnToast2 = findViewById(R.id.bt_toast_2);
        btnToast3 = findViewById(R.id.bt_toast_3);
        Onclick onclick = new Onclick();
        btnToast1.setOnClickListener(onclick);
        btnToast2.setOnClickListener(onclick);
        btnToast3.setOnClickListener(onclick);
    }

    private class Onclick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.bt_toast_1:
                    Toast.makeText(getApplicationContext(),"点击了默认按钮",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.bt_toast_2:
                    Toast centerToast= Toast.makeText(getApplicationContext(),"改变位置-居中",Toast.LENGTH_SHORT);
                    centerToast.setGravity(Gravity.CENTER,0,0);
                    centerToast.show();
                    break;
                case R.id.bt_toast_3:
                    Toast customToast = new Toast(getApplicationContext());
                    LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
                    View view = inflater.inflate(R.layout.layout_toast,null);
                    ImageView imageView = view.findViewById(R.id.toast_img);
                    TextView textView = view.findViewById(R.id.toast_text);
                    imageView.setImageResource(R.drawable.meh);
                    textView.setText("自定义Toast");
                    customToast.setDuration(Toast.LENGTH_LONG);
                    customToast.setView(view);
                    customToast.show();
                    break;
            }
        }
    }
}
