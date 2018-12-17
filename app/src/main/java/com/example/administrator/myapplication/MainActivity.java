package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.myapplication.fragment.ContainerActivity;

public class MainActivity extends AppCompatActivity {
    private Button mUIButton,mFragmentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUIButton = findViewById(R.id.btn_ui);
        mFragmentButton = findViewById(R.id.btn_fragment);
        bindOnclick();
    }

    private void bindOnclick() {
        Onclick onclick = new Onclick();
        mUIButton.setOnClickListener(onclick);
        mFragmentButton.setOnClickListener(onclick);
    }


    private class Onclick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_ui:
                    intent = new Intent(MainActivity.this,UIActivity.class);
                    break;
                case R.id.btn_fragment:
                    intent = new Intent(MainActivity.this,ContainerActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
