package com.example.papb.tapapb;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DoaDetailActivity extends AppCompatActivity {
    String jenisDoa;
    ImageView btnPlay;
    ImageView btnStop;
    ImageView ImageArabic;
    //ImageView ImgDetail;
    TextView TextArti;
    ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_detail);

        jenisDoa = getIntent().getStringExtra("jenis_doa");

        //membuat variable media player yang menamoung file mp3
        final MediaPlayer[] mediaPlayer = {MediaPlayer.create(this, R.raw.doa_sebelum_makan)};
        mediaPlayer[0].setLooping(true); //biar bisa diplay >1x

        ImageArabic = (ImageView) findViewById(R.id.image_arabic);
        //ImgDetail = (ImageView) findViewById(R.id.img_detail);
        TextArti = (TextView) findViewById(R.id.text_arti);
        btnPlay = (ImageView) findViewById(R.id.btn_play);
        btnStop = (ImageView) findViewById(R.id.btn_stop);
        btnBack = (ImageView) findViewById(R.id.btn_back);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        if (jenisDoa.equals("sesudah_makan")) {
            TextArti.setText("Segala puji bagi Allah yang memberi kami makan dan minum serta menjadikan kami memeluk agama islam");
            ImageArabic.setImageResource(R.drawable.makan);
          //  ImgDetail.setImageResource(R.drawable.susudah_makan);

        } else if (jenisDoa.equals("sebelum_makan")) {
            TextArti.setText("Yaa Allah, berkatilah rezeki yang engkau berikan kepada kami, dan peliharalah kami dari siksa api neraka");
            ImageArabic.setImageResource(R.drawable.makan);

        } else if (jenisDoa.equals("sesudah_wudhu")){
            TextArti.setText("Aku bersaksi bahwa tiada Tuhan melainkan Allah dan tidak ada yang menyekutukanNya. Aku bersaksi bahwa Nabi Muhammad adalah hamba-Nya dan utusan-Nya. Ya Allah, jadikanlah aku orang yang ahli bertobat, jadikanlah aku orang yang suci, dan jadikanlah aku dari golongan orang-orang yang saleh");
            ImageArabic.setImageResource(R.drawable.makan);

        } else if (jenisDoa.equals("sebelum_wudhu")){
            TextArti.setText("Saya berniat wudhu’untuk membersihkan dari hadas kecil sebagai kewajiban karena perintahan Allah Yang Maha Tinggi");
            ImageArabic.setImageResource(R.drawable.makan);

        } else if (jenisDoa.equals("sesudah_tidur")){
            TextArti.setText("Segala puji bagi Allah yang menghidupkan aku kembali setelah mematikan aku dan kepada Allah akan bangkit");
            ImageArabic.setImageResource(R.drawable.makan);

        } else if (jenisDoa.equals("sebelum_tidur")){
            TextArti.setText("Dengan nama-Mu ya Allah aku hidup dan mati");
            ImageArabic.setImageResource(R.drawable.makan);

        }else if (jenisDoa.equals("keluar_rumah")){
            TextArti.setText("Dengan nama-Mu ya Allah aku hidup dan mati");
            ImageArabic.setImageResource(R.drawable.makan);

        }else if (jenisDoa.equals("masuk_rumah")) {
            TextArti.setText("Dengan nama-Mu ya Allah aku hidup dan mati");
            ImageArabic.setImageResource(R.drawable.makan);
        }

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer[0].reset();
                mediaPlayer[0] = MediaPlayer.create(getApplicationContext(), R.raw.doa_sebelum_makan);
                mediaPlayer[0].start(); //nyalain

                btnStop.setVisibility(View.VISIBLE);
                btnPlay.setVisibility(View.GONE);
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer[0].stop();

                btnPlay.setVisibility(View.VISIBLE);
                btnStop.setVisibility(View.GONE);
            }
        });

}}
