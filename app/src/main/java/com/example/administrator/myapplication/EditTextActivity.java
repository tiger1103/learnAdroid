package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends AppCompatActivity {
    private Button loginBtn;
    private EditText editTextPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        loginBtn = findViewById(R.id.login_btn);
        loginBtn.setOnClickListener((v)->{
            Toast.makeText(EditTextActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
        });
        editTextPhone = findViewById(R.id.et_1);
        editTextPhone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("textContent:",s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
