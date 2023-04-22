package com.example.matdaan.activities;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.matdaan.R;

public class farecompare extends AppCompatActivity {

//    private String starting,ending;
    private int d;
    private int buy;
    private TextView uberfare,olafare;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farecompare);

        uberfare = findViewById(R.id.Uberfare);
        olafare = findViewById(R.id.Olafare);

        String start = getIntent().getStringExtra("keystart").trim();
        String end = getIntent().getStringExtra("keyend").trim();


        fareshow(start,end,"bennett university","ndls",51);
        fareshow(start,end,"bennett university","pari chowk",11);
        fareshow(start,end,"bennett university","depot",8);
        fareshow(start,end,"bennett university","sector 51",37);
    }

    private void fareshow(String start,String end,String starting,String ending,int dis)
    {
        if((start.equalsIgnoreCase(starting.trim())&&end.equalsIgnoreCase(ending.trim()))||(start.equalsIgnoreCase(ending.trim())&&end.equalsIgnoreCase(starting.trim())))
        {
            d=dis;
            if(d>20)
            {
                buy = 120;
                if(d>40)
                {
                    buy = 120+240;
                    if(d>60)
                        buy = 120+240+360;
                    else
                        buy=120+240+(18*(d-40));
                }
                else
                    buy=120+((d-20)*12);
            }
            else
                buy = d*6;
            buy += (buy/2);
            buy +=(buy*0.18);
            uberfare.setText(Integer.toString(buy));
            olafare.setText(Integer.toString((int) (buy+(100.0*Math.random()))));
        }
    }

}
