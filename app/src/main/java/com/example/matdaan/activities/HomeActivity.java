package com.example.matdaan.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.matdaan.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import de.hdodenhof.circleimageview.CircleImageView;


public class HomeActivity extends AppCompatActivity {

    public static final String PREFERENCES = "prefKey";
    SharedPreferences sharedPreferences;
    public static final String IsLogin = "islogin";

    private CircleImageView circleImg;
    private TextView name, nationalId;
    private String uid;
    private FirebaseAuth mAuth;
    private FirebaseFirestore firebaseFirestore;
    public EditText starting;
    public EditText ending;
    private Button respect;
    private Button logout;
    private FirebaseFirestore db;

//    SharedPreferences sharedPreferences;

    StorageReference reference;
//    FirebaseFirestore firebaseFirestore;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        sharedPreferences = getApplicationContext().getSharedPreferences(PREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor pref = sharedPreferences.edit();

//        sharedPreferences=getApplicationContext().getSharedPreferences(PREFERENCES,MODE_PRIVATE);
//        reference = FirebaseStorage.getInstance().getReference();
//        firebaseFirestore =  FirebaseFirestore.getInstance();

        pref.putBoolean(IsLogin, true);
        pref.commit();

        starting = findViewById(R.id.Starting);
        ending = findViewById(R.id.Ending);
        respect = findViewById(R.id.Searching);
        db = FirebaseFirestore.getInstance();
        mAuth=FirebaseAuth.getInstance();
        logout = findViewById(R.id.button2);


//        logout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mAuth.signOut();
////                String task = "devesh";
////                Intent intent = new Intent(HomeActivity.this, farecompare.class);
//                Intent intent = new Intent(HomeActivity.this,LoginActivity.class);
////                intent.putExtra("keys",task );
//                startActivity(intent);
//                finish();
//                Toast.makeText(HomeActivity.this, "Logout Successfully", Toast.LENGTH_SHORT).show();
//            }
//        });

                logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                pref.putBoolean(IsLogin,false);
                pref.commit();
                startActivity(new Intent(HomeActivity.this,LoginActivity.class));
                finish();
            }
        });

        respect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    String start = starting.getText().toString();
                    String end = ending.getText().toString();
                if(!TextUtils.isEmpty(start)&&!TextUtils.isEmpty(end)) {
                    Intent intent = new Intent(HomeActivity.this, farecompare.class);
                    intent.putExtra("keystart", start);
                    intent.putExtra("keyend", end);
                    startActivity(intent);
                }else{
                    Toast.makeText(HomeActivity.this,"Please enter location",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}