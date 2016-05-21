package com.example.papb.tapapb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntro2;

public class PanduanActivity extends AppIntro2 {


    @Override
    public void init(Bundle savedInstanceState) {
        panduan1 satu = new panduan1();
        panduan2 dua = new panduan2();
        panduan3 tiga = new panduan3();
        panduan4 empat = new panduan4();
        panduan5 lima = new panduan5();
        Panduan6 enam = new Panduan6();
        Panduan7 tujuh = new Panduan7();
        Panduan8 delapan = new Panduan8();

        addSlide(satu);
        addSlide(dua);
        addSlide(tiga);
        addSlide(empat);
        addSlide(lima);
        addSlide(enam);
        addSlide(tujuh);
        addSlide(delapan);

        setProgressButtonEnabled(true);

        //setFadeAnimation();
        //setZoomAnimation();
        //setFlowAnimation();
        setSlideOverAnimation();
    }

    @Override
    public void onDonePressed() {
    onBackPressed();
    }

    @Override
    public void onNextPressed() {

    }

    @Override
    public void onSlideChanged() {

    }
}
