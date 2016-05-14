package com.example.papb.tapapb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout btnDoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDoa = (LinearLayout) findViewById(R.id.btn_doa);
        
        btnDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "doa anak", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, DoaAnakActivity.class));
            }
        });
    }
}
