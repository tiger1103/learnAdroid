package com.example.administrator.myapplication.recycleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.myapplication.R;

public class RecycleViewActivity extends AppCompatActivity {

    private Button btnLinea,btnHor,btnGrid,btnPu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        btnLinea = findViewById(R.id.btn_linear);
        btnHor = findViewById(R.id.btn_hor);
        btnGrid = findViewById(R.id.btn_grid);
        btnPu = findViewById(R.id.btn_pu);

        btnLinea.setOnClickListener((v)->{
            Intent intent = new Intent(RecycleViewActivity.this,LineaRecycleViewActivity.class);
            startActivity(intent);
        });
        btnHor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecycleViewActivity.this,HorRecycleViewActivity.class);
                startActivity(intent);
            }
        });
        btnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecycleViewActivity.this,GridRecycleViewActivity.class);
                startActivity(intent);
            }
        });

        btnPu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecycleViewActivity.this,PuRecycleViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
