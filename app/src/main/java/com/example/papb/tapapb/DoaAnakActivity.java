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
    LinearLayout btnSesudahMakan;
    LinearLayout btnSebelumMakan;
    LinearLayout btnSesudahWudhu;
    LinearLayout btnSebelumWudhu;
    LinearLayout btnSesudahTidur;
    LinearLayout btnSebelumTidur;
    LinearLayout btnKeluarRumah;
    LinearLayout btnMasukRumah;
    ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_anak);

        //konversi dulu dari view ke objec java
        btnSesudahMakan = (LinearLayout) findViewById(R.id.btn_sesudah_makan);
        btnSebelumMakan = (LinearLayout) findViewById(R.id.btn_sebelum_makan);
        btnSesudahWudhu = (LinearLayout) findViewById(R.id.btn_sesudah_wudhu);
        btnSebelumWudhu = (LinearLayout) findViewById(R.id.btn_sebelum_wudhu);
        btnSebelumTidur = (LinearLayout) findViewById(R.id.btn_sebelum_tidur);
        btnSesudahTidur = (LinearLayout) findViewById(R.id.btn_sesudah_tidur);
        btnKeluarRumah = (LinearLayout) findViewById(R.id.btn_keluar_rumah);
        btnMasukRumah = (LinearLayout) findViewById(R.id.btn_masuk_rumah);
        btnBack = (ImageView) findViewById(R.id.btn_back);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        //stelah diklik mau kemana? bagian ini menunjuk klik dengan put ekstra, dimana memn=beri wadah dengan memanggil string doadetailactivity
        //memisahkan pemanggilan tiap detail doa
        btnSebelumMakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoaAnakActivity.this, DoaDetailActivity.class).putExtra("jenis_doa", "sebelum_makan"));
        }
        });

        btnSesudahMakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoaAnakActivity.this, DoaDetailActivity.class).putExtra("jenis_doa", "sesudah_makan"));
            }
        });

        btnSebelumWudhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoaAnakActivity.this, DoaDetailActivity.class).putExtra("jenis_doa", "sebelum_wudhu"));
            }
        });

        btnSesudahWudhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoaAnakActivity.this, DoaDetailActivity.class).putExtra("jenis_doa", "sesudah_wudhu"));
            }
        });

        btnSebelumTidur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoaAnakActivity.this, DoaDetailActivity.class).putExtra("jenis_doa", "sebelum_tidur"));
            }
        });

        btnSesudahTidur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoaAnakActivity.this, DoaDetailActivity.class).putExtra("jenis_doa", "sesudah_tidur"));
            }
        });

        btnKeluarRumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoaAnakActivity.this, DoaDetailActivity.class).putExtra("jenis_doa", "keluar_rumah"));
            }
        });

        btnMasukRumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity (new Intent(DoaAnakActivity.this, DoaDetailActivity.class).putExtra("jenis_doa", "masuk_rumah"));
            }
        });
    }

    //biar fungsinya kaya back button
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
