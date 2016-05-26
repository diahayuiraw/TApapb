package com.example.papb.tapapb;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.Typeface;
public class DoaDetailActivity extends AppCompatActivity {
    String jenisDoa;
    ImageView btnPlay;
    ImageView btnStop;
    ImageView ImageArabic;
    ImageView ImgDetail;
    TextView TextArti;
    ImageView btnBack;
    TextView TextArabic;
    TextView TextHeader;

    int sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_detail);

        jenisDoa = getIntent().getStringExtra("jenis_doa");
        String PathFont = "Bahij_Droid_Naskh-Regular.ttf";

        //membuat variable media player yang menampung file audio
        final MediaPlayer[] mediaPlayer = {MediaPlayer.create(this, R.raw.doa_sebelum_makan)};
        //mediaPlayer[0].setLooping(true); //biar bisa diplay >1x

        ImageArabic = (ImageView) findViewById(R.id.image_arabic);ImgDetail = (ImageView) findViewById(R.id.img_detail);
        TextArti = (TextView) findViewById(R.id.text_arti);
        btnPlay = (ImageView) findViewById(R.id.btn_play);
        btnStop = (ImageView) findViewById(R.id.btn_stop);
        btnBack = (ImageView) findViewById(R.id.btn_back);
        ImgDetail = (ImageView) findViewById(R.id.img_detail);
        TextArabic = (TextView) findViewById(R.id.text_arabic);
        TextHeader = (TextView) findViewById(R.id.text_header);

        Typeface tf = Typeface.createFromAsset(getAssets(), PathFont);
        TextArabic.setTypeface(tf);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        if (jenisDoa.equals("sesudah_makan")) {
            TextArti.setText("Segala puji bagi Allah yang memberi kami makan dan minum serta menjadikan kami memeluk agama islam");
            //ImageArabic.setImageResource(R.drawable.makan);
            ImgDetail.setImageResource(R.drawable.sesudah_makan);
            sound = R.raw.doa_sebelum_makan;
            TextArabic.setText("اَلْحَمْدُ ِللهِ الَّذِيْنَ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مِنَ الْمُسْلِمِيْنَ");
            TextHeader.setText("Doa Sesudah Makan");

        } else if (jenisDoa.equals("sebelum_makan")) {
            TextArti.setText("Yaa Allah, berkatilah rezeki yang engkau berikan kepada kami, dan peliharalah kami dari siksa api neraka");
            //ImageArabic.setImageResource(R.drawable.makan);
            ImgDetail.setImageResource(R.drawable.sebelum_makan);
            sound = R.raw.doa_setelah_makan;
            TextArabic.setText("الَّلهُمَّ بَارِكْ لَنَا فِيمَا رَزَقْتَنَا، وَقِنَا عَذَابَ النَّارِ");
            TextHeader.setText("Doa Sebelum Makan");

        } else if (jenisDoa.equals("sebelum_wudhu")){
            TextArti.setText("Aku bersaksi bahwa tiada Tuhan melainkan Allah dan tidak ada yang menyekutukanNya. Aku bersaksi bahwa Nabi Muhammad adalah hamba-Nya dan utusan-Nya. Ya Allah, jadikanlah aku orang yang ahli bertobat, jadikanlah aku orang yang suci, dan jadikanlah aku dari golongan orang-orang yang saleh");
            //ImageArabic.setImageResource(R.drawable.makan);
            ImgDetail.setImageResource(R.drawable.sebelum_wudhu);
            sound = R.raw.doa_sebelum_wudhu;
            TextArabic.setText("اَشْهَدُ اَنْ لآّاِلهَ اِلاَّاللهُ وَحْدَهُ لاَشَرِيْكَ لَهُ وَاَشْهَدُ اَنَّ مُحَمَّدًاعَبْدُهُ وَرَسُوْلُهُ. اَللهُمَّ اجْعَلْنِىْ مِنَ التَّوَّابِيْنَ وَاجْعَلْنِىْ مِنَ الْمُتَطَهِّرِيْنَ وَاجْعَلْنِىْ مِنْ ");
            TextHeader.setText("Doa Sebelum Wudhu");

        } else if (jenisDoa.equals("setelah_wudhu")){
            TextArti.setText("Saya berniat wudhu’untuk membersihkan dari hadas kecil sebagai kewajiban karena perintahan Allah Yang Maha Tinggi");
            //ImageArabic.setImageResource(R.drawable.makan);
            ImgDetail.setImageResource(R.drawable.sesudah_wudhu);
            sound = R.raw.doa_setelah_wudhu;
            TextArabic.setText("اَشْهَدُ اَنْ لآّاِلهَ اِلاَّاللهُ وَحْدَهُ لاَشَرِيْكَ لَهُ وَاَشْهَدُ اَنَّ مُحَمَّدًاعَبْدُهُ وَرَسُوْلُهُ. اَللهُمَّ اجْعَلْنِىْ مِنَ التَّوَّابِيْنَ وَاجْعَلْنِىْ مِنَ الْمُتَطَهِّرِيْنَ وَاجْعَلْنِىْ مِنْ  ");
            TextHeader.setText("Doa Setelah Makan");

        } else if (jenisDoa.equals("sesudah_tidur")){
            TextArti.setText("Segala puji bagi Allah yang menghidupkan aku kembali setelah mematikan aku dan kepada Allah akan bangkit");
            //ImageArabic.setImageResource(R.drawable.makan);
            ImgDetail.setImageResource(R.drawable.sesudah_tidur);
            sound = R.raw.doa_setelah_tidur;
            TextArabic.setText("اَلْحَمْدُ ِللهِ الَّذِى أَحْيَانَا بَعْدَمَا أَمَاتَنَا وَإِلَيْهِ النُّشُورُ");
            TextHeader.setText("Doa Sesudah Tidur");

        } else if (jenisDoa.equals("sebelum_tidur")){
            TextArti.setText("Dengan nama-Mu ya Allah aku hidup dan mati");
            //ImageArabic.setImageResource(R.drawable.makan);
            ImgDetail.setImageResource(R.drawable.sebelum_tidur);
            sound = R.raw.doa_sebelum_tidur;
            TextArabic.setText("بِاسْمِكَ اللّهُمَّ أَحْيَاوَأَمُوتُ");
            TextHeader.setText("Doa Sebelum Tidur");

        }else if (jenisDoa.equals("keluar_rumah")){
            TextArti.setText("Dengan menyebut nama Allah, aku menyerahkan diriku pada Allah dan tidak ada daya dan kekuatan selain dengan Allah saja");
            //ImageArabic.setImageResource(R.drawable.makan);
            sound = R.raw.doa_keluar_rumah;
            TextArabic.setText("بِسْمِ اللَّهِ ، تَوَكَّلْتُ عَلَى اللَّهِ ، وَلا حَوْلَ وَلا قُوَّةَ إِلاَّ بِاللَّه");
            TextHeader.setText("Doa Keluar Rumah");

        }else if (jenisDoa.equals("masuk_rumah")) {
            TextArti.setText("Dengan nama Allah kami masuk rumah, dengan nama Allah aku keluar rumah, serta kepada-Nya aku berserah diri");
            //ImageArabic.setImageResource(R.drawable.makan);
            sound = R.raw.doa_masuk_rumah;
            TextArabic.setText("بِسْمِ اللهِ وَلَجْنَا وَبِسْمِ اللهِ خَرَجْنَا ، وَعَلَى اللهِ رَبَّنَا تَوَكَّلْنَا");
            TextHeader.setText("Doa Masuk Rumah");
        }

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer[0].reset();
                mediaPlayer[0] = MediaPlayer.create(getApplicationContext(), sound);
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

}

    @Override
    public void onBackPressed() {

        finish();
    }
}
