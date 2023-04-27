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
        String s[]={"bennett university","pari chowk","depot","ndls","the grand venice mall","decathlon","gautam buddha university","akshardham","omaxe palm greens","sharda university","sector 51","alpha 2 main market","eldeco shopping complex","red fort","lotus temple","gaziabad","humayun's tomb","indira gandhi international airport","indira gandhi airport","delhi airport","anand vihar terminal","vaishali metro station","mandi house metro station","worlds of wonder","botanical garden","rohini","Jantan mantar","Rashtrapati bhavan museum","hauz khas fort","Aiims hospital","faridabad","Lajpat nagar","qutub minar","museum of illusions","national gallery of modern art","amar jawan jyoti","agrasen ki baoli","sunder nursery","garden of five senses","waste to wonder park","lodhi garden","chandni chowk","delhi haat","bharat darshan park","gurudwara shri bangla sahib","rail museum","nizamuddin dargah sharif","delhi zoo","jama masjid","sarojini nagar market","iskon temple","paharganj","birla mandir","purana qila","adventure island","pragati maidan","rajghat","rajpath","karol bagh market","firoz shah kotla stadium","buddh international circuit","surajpur bird sanctuary","msx mall","ansal plaza mall","sector 52","sector 34","noida city centre","golf course","new ashok nagar","mayur vihar","yamuna bank","supreme court","dwarka","shastri nagar","netaji subhash place","rithala","delhi aero city","huda city centre","indraprastha","iit delhi","kashmere gate","delhi gate","ito","sabzi mandi","munshi puliya lucknow","prayagraj","unnao","kolkata","nawanshahr","meerut","gurugram","ansal orchid deffodil","bhiwani","Select CityWalk Mall","DLF Promenade Mall","DLF Emporio Mall","Ambience Mall","radisson blu hotel","Pacific Mall","City Square Mall","TDI Mall","Metro Walk Mall","DLF City Center Mall","V3S Mall","Cross River Mall","The Chanakya Mall","hauz khas metro station"};

        respect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String start = starting.getText().toString();
                String end = ending.getText().toString();
                if(check(start,end,s))
                {
                    if(!TextUtils.isEmpty(start)&&!TextUtils.isEmpty(end)) {
                        Intent intent = new Intent(HomeActivity.this, farecompare.class);
                        intent.putExtra("keystart", start);
                        intent.putExtra("keyend", end);
                        startActivity(intent);
                    }else{
                        Toast.makeText(HomeActivity.this,"Please enter location",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private boolean check(String start,String end,String s[]){
        int a=0,b=0;
        for(String i:s){
            if(i.equals(start))
            {
                a=1;
                break;
            }
        }
        if(a==1){
            for(String i1:s){
                if(i1.equals(end))
                {
                    b=1;
                    break;
                }
            }
        }
        else{
            return false;
        }
        if(a==1&&b==1){
            return true;
        }
        else
            return false;
    }
}
