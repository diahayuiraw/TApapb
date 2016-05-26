package com.example.papb.tapapb;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout btnDoa;
    LinearLayout btnPanduan;
    ImageView btnSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDoa = (LinearLayout) findViewById(R.id.btn_doa);
        btnPanduan = (LinearLayout) findViewById(R.id.btn_panduan);
        btnSetting = (ImageView) findViewById(R.id.btn_Setting);
        
        btnDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Doa Anak", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, DoaAnakActivity.class));
            }
        });

        btnPanduan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Panduan", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, PanduanActivity.class));
            }
        });

        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SettingAlarm.class));
            }
        });
    }
}
