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
        fareshow(start,end,"bennett university","pari chowk",10);
        fareshow(start,end,"bennett university","depot",8);
        fareshow(start,end,"bennett university","sector 51",37);
        fareshow(start,end,"bennett university","the grand venice mall",8.2);
        fareshow(start,end,"bennett university","decathlon",14.2);
        fareshow(start,end,"bennett university","gautam buddha university",7.9);
        fareshow(start,end,"bennett university","alpha 2 main market",10.8);
        fareshow(start,end,"bennett university","sharda university",15.3);
        fareshow(start,end,"bennett university","omaxe palm greens",8.8);
        fareshow(start,end,"bennett university","gbu shopping complex",9.83);
        fareshow(start,end,"bennett university","eldeco shopping complex",5.8);
        fareshow(start,end,"bennett university","knowledge park 2 ",13.57);
        fareshow(start,end,"bennett university","akshardham",44.2);
        fareshow(start,end,"bennett university","lotus temple",43.8);
        fareshow(start,end,"bennett university","red fort",49.6);
        fareshow(start,end,"bennett university","india gate",49);
        fareshow(start,end,"bennett university","connaught place",50.3);
        fareshow(start,end,"bennett university","gaziabad",42.6);
        fareshow(start,end,"bennett university","humayun's tomb",47.7);
        fareshow(start,end,"bennett university","indira gandhi international airport",59);
        fareshow(start,end,"bennett university","anand vihar terminal",47);
        fareshow(start,end,"bennett university","vaishali metro station",53);
        fareshow(start,end,"bennett university","mandi house metro station",47.7);
        fareshow(start,end,"bennett university","worlds of wonder",37.6);
        fareshow(start,end,"bennett university","botanical garden",36);
        fareshow(start,end,"bennett university","rohini",75);
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
