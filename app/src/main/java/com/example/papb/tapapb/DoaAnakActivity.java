package com.example.papb.tapapb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class DoaAnakActivity extends AppCompatActivity {
    //bkin ini dulu
    LinearLayout btnSebelumMakan;
    ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_anak);

        //konversi dulu dari view ke objec java
        btnSebelumMakan = (LinearLayout) findViewById(R.id.btn_sebelum_makan);
        btnBack = (ImageView) findViewById(R.id.btn_back);

        //stelah diklik mau kemana?
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        btnSebelumMakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoaAnakActivity.this, DoaDetailActivity.class));
            }
        });
    }

    //biar fungsinya kaya back button
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
