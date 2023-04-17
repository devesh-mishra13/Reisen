package com.example.matdaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import com.example.matdaan.activities.HomeActivity;
import com.example.matdaan.activities.LoginActivity;

// BHAI SIRF EK BAAR CHECK KR RAHA KAISE HOTA HAI


public class MainActivity extends AppCompatActivity {

    public static final String PREFERENCES = "prefKey";
    SharedPreferences sharedPreferences;
    public static final String IsLogin = "islogin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart(){
        super.onStart();

        sharedPreferences=getApplicationContext().getSharedPreferences(PREFERENCES,MODE_PRIVATE);
        boolean bol =sharedPreferences.getBoolean(IsLogin,false);

        new Handler().postDelayed(()->{
            if(bol){
                startActivity(new Intent(MainActivity.this, HomeActivity.class));
                finish();
            }
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            finish();
        },3000);
    }
}
