package com.example.a403.exam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    Button btn_start, btn_end, cancle;
    RadioButton rdo_cal, rdo_time;
    CalendarView cal;
    TimePicker tp;
    Chronometer crn;
    boolean mSwc = true;

    private Switch sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("놀이동산 예약시스템");
        crn = (Chronometer) findViewById(R.id.crn);
        btn_start = (Button) findViewById(R.id.btn_start);
        btn_end = (Button) findViewById(R.id.btn_end);
        rdo_cal = (RadioButton) findViewById(R.id.rdo_cal);
        rdo_time = (RadioButton) findViewById(R.id.rdo_time);
        cal = (CalendarView) findViewById(R.id.cal);
        tp = (TimePicker) findViewById(R.id.tp);
        Switch swc = (Switch)findViewById(R.id.swc);
        //swc.setOnCheckedChangeListener(SWITCH);

        cal.setVisibility(View.INVISIBLE);
        tp.setVisibility(View.INVISIBLE);
        crn = (Chronometer) findViewById(R.id.crn);

        rdo_cal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.setVisibility(View.VISIBLE);
                tp.setVisibility(View.INVISIBLE);
            }
        });

        rdo_time.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cal.setVisibility(View.INVISIBLE);
                tp.setVisibility(View.VISIBLE);
            }
        });

        btn_start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                crn.setBase(SystemClock.elapsedRealtime());
                crn.start();
                crn.setTextColor(Color.RED);
            }
        });

        btn_end.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                crn.stop();
                crn.setTextColor(Color.BLUE);

                java.util.Calendar curDate = java.util.Calendar.getInstance();
                curDate.setTimeInMillis(cal.getDate());
            }


       // public Switch.OnCheckedChangeListener Switch = new SWITCH.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
                mSwc = arg1;
            }
        };
    }
    }



