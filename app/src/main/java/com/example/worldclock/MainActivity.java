package com.example.worldclock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    EditText e2;
    EditText e3;
    EditText e4;
    EditText e5;
    Button AccessTime;
    SimpleDateFormat simpleDateFormat;
    String time;
    String time1;
    String time2;
    String time3;
    String time4;
    String time5;
    java.util.Calendar calendar;
    java.util.Calendar calendar2;
    java.util.Calendar calendar3;
    java.util.Calendar calendar4;
    java.util.Calendar calendar5;
    DateFormat df;
    Date today;

    TimeZone tz1;
    TimeZone tz2;
    TimeZone tz3;
    TimeZone tz4;
    TimeZone tz5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText)findViewById(R.id.editText3);
        e2 = (EditText)findViewById(R.id.editText6);
        e3 = (EditText)findViewById(R.id.editText7);
        e4 = (EditText)findViewById(R.id.editText9);
        e5 = (EditText)findViewById(R.id.editText10);

        AccessTime = (Button)findViewById(R.id.button);
        AccessTime.setText("Display Times !");


        calendar = Calendar.getInstance();
        simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

        time = simpleDateFormat.format(calendar.getTime());
        AccessTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText(time);
            }
        });




        time2= new SimpleDateFormat("hh:mm:ss a").format(new Date(calendar.getTimeInMillis()));
        tz2 = TimeZone.getTimeZone("Japan/Tokyo");
        e2.setText(time2);

        time3= new SimpleDateFormat("hh:mm:ss a").format(new Date(calendar.getTimeInMillis()));
        tz3 = TimeZone.getTimeZone("Japan/Tokyo");
        e3.setText(time3);


        time4= new SimpleDateFormat("hh:mm:ss a").format(new Date(calendar.getTimeInMillis()));
        tz4 = TimeZone.getTimeZone("China/Beijing");
        e4.setText(time4);


        time5= new SimpleDateFormat("hh:mm:ss a").format(new Date(calendar.getTimeInMillis()));
        tz5 = TimeZone.getTimeZone("England/London");
        e5.setText(time5);








    }
}
