package com.example.matdaan.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.matdaan.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import de.hdodenhof.circleimageview.CircleImageView;


public class HomeActivity extends AppCompatActivity {

    public static final String PREFERENCES = "prefKey";
    SharedPreferences sharedPreferences;
    public static final String IsLogin = "islogin";

    private CircleImageView circleImg;
    private TextView name, nationalId;
    private String uid;
    private FirebaseFirestore firebaseFirestore;
    public EditText starting;
    public EditText ending;
    private Button respect;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        SessionConfiguration config = new SessionConfiguration.Builder().setClientId("sD6X_uEoITrXZdnfJ3xBvbbZHrHUS0Oo").setServerToken().setRedirectUrl().setScopes();

        sharedPreferences = getApplicationContext().getSharedPreferences(PREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor pref = sharedPreferences.edit();
        pref.putBoolean(IsLogin, true);
        pref.commit();

//        findViewById(R.id.log_out).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FirebaseAuth.getInstance().signOut();
//                pref.putBoolean(IsLogin,false);
//                pref.commit();
//                startActivity(new Intent(HomeActivity.this,LoginActivity.class));
//                finish();
//            }
//        });
        starting = findViewById(R.id.Starting);
        ending = findViewById(R.id.Ending);
        respect = findViewById(R.id.Searching);

        respect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}