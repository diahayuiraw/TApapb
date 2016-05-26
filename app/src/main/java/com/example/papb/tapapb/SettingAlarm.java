package com.example.papb.tapapb;

import android.app.TimePickerDialog;
import android.content.SharedPreferences;
import android.graphics.Shader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class SettingAlarm extends AppCompatActivity {

    TextView time;
    SharedPreferences timeSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_alarm);

        time = (TextView) findViewById(R.id.time);
        timeSave = this.getSharedPreferences("saved", MODE_PRIVATE);
        if (timeSave.contains("timeBungkus")){
            time.setText(timeSave.getString("timeBungkus", ""));
        }

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar waktuSekarang = Calendar.getInstance();
                int hour = waktuSekarang.get(Calendar.HOUR_OF_DAY);
                int minute = waktuSekarang.get(Calendar.MINUTE);

                TimePickerDialog timePicker = new TimePickerDialog(SettingAlarm.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        time.setText(hourOfDay + ";" + minute);
                        timeSave.edit().putString("timeBungkus", hourOfDay + "." + minute).apply();
                    }
                },hour, minute, true);
                timePicker.show();
            }
        });



    }
}


//setting servise, terus notif nya itu pake wakelock biar dia muncul ketika kekunci; berjalan dibackground.