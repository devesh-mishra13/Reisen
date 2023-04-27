package com.example.matdaan.activities;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.matdaan.R;

public class farecompare extends AppCompatActivity {

//    private String starting,ending;
    private double d;
    private double buy;
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
        fareshow(start,end,"bennett university","jantar mantar",50);
        fareshow(start,end,"bennett university","rashtrapati bhavan museum",53);
        fareshow(start,end,"bennett university","hauz khas fort",51);
        fareshow(start,end,"bennett university","aiims hospital",48);
        fareshow(start,end,"bennett university","faridabad",54);
        fareshow(start,end,"bennett university","lajpat nagar",45);
        fareshow(start,end,"bennett university","qutub minar",53);
        fareshow(start,end,"bennett university","museum of illusions",50);
        fareshow(start,end,"bennett university","national galery of modern art",49);
        fareshow(start,end,"bennett university","amar jawan jyoti",50);
        fareshow(start,end,"bennett university","agrasen ki baoli",49);
        fareshow(start,end,"bennett university","sundar nursery",47);
        fareshow(start,end,"bennett university","garden of five senses",55);
        fareshow(start,end,"bennett university","waste to wonder park",43);
        fareshow(start,end,"bennett university","lodhi garden",49);
        fareshow(start,end,"bennett university","chandni chowk",50);
        fareshow(start,end,"bennett university","delhi haat",52);
        fareshow(start,end,"bennett university","bharat darshan park",60);
        fareshow(start,end,"bennett university","gurudwara shri bangla sahib",51);
        fareshow(start,end,"bennett university","rail museum",52);
        fareshow(start,end,"bennett university","nizamuddin dargah sharif",45);
        fareshow(start,end,"bennett university","delhi zoo",49);
        fareshow(start,end,"bennett university","jama masjid",50);
        fareshow(start,end,"bennett university","sarojini nagar market",50);
        fareshow(start,end,"bennett university","iskcon temple",45);
        fareshow(start,end,"bennett university","paharganj",52);
        fareshow(start,end,"bennett university","birla mandir",52);
        fareshow(start,end,"bennett university","purana qila",49);
        fareshow(start,end,"bennett university","adventure island",70);
        fareshow(start,end,"bennett university","pragati maidan",48);
        fareshow(start,end,"bennett university","rajghat",48);
        fareshow(start,end,"bennett university","rajpath",50);
        fareshow(start,end,"bennett university","karol bagh market",53);
        fareshow(start,end,"bennett university","nehru park",52);
        fareshow(start,end,"bennett university","pragati maidan",47);
        fareshow(start,end,"bennett university","feroz shah kotla stadium",48);
        fareshow(start,end,"bennett university","buddh international circuit",20);
        fareshow(start,end,"bennett university","surajpur bird sanctuary",17);
        fareshow(start,end,"bennett university","msx mall",8.5);
        fareshow(start,end,"bennett university","ansal plaza mall",11);
        fareshow(start,end,"bennett university","sector 52",37);
        fareshow(start,end,"bennett university","sector 34",37);
        fareshow(start,end,"bennett university","noida city centre",27);
        fareshow(start,end,"bennett university","golf course",37);
        fareshow(start,end,"bennett university","new ashok nagar",39);
        fareshow(start,end,"bennett university","mayur vihar",42);
        fareshow(start,end,"bennett university","yamuna bank",44);
        fareshow(start,end,"bennett university","supreme court",47);
        fareshow(start,end,"bennett university","dwarka",68);
        fareshow(start,end,"bennett university","shastri nagar",58);
        fareshow(start,end,"bennett university","netaji subhash place",63);
        fareshow(start,end,"bennett university","rithala",74);
        fareshow(start,end,"bennett university","delhi aerocity",62);
        fareshow(start,end,"bennett university","huda city centre",75);
        fareshow(start,end,"bennett university","indraprastha",47);
        fareshow(start,end,"bennett university","iit delhi",51);
        fareshow(start,end,"bennett university","kashmere gate",53);
        fareshow(start,end,"bennett university","delhi gate",48);
        fareshow(start,end,"bennett university","ito",47);
        fareshow(start,end,"bennett university","sabzi mandi",56);
        fareshow(start,end,"bennett university","munshi pulia lucknow",514);
        fareshow(start,end,"bennett university","prayagraj",644);
        fareshow(start,end,"bennett university","unnao",481);
        fareshow(start,end,"bennett university","kolkata",1515);
        fareshow(start,end,"bennett university","nawanshahr",377);
        fareshow(start,end,"bennett university","meerut",79);
        fareshow(start,end,"bennett university","gurugram",77);
        fareshow(start,end,"bennett university","ansal orchid deffodil",501);
        fareshow(start,end,"bennett university","varanasi",819);
        fareshow(start,end,"bennett university","bhiwani",173);
        fareshow(start,end,"bennett university","indira gandhi airport",59);
        fareshow(start,end,"bennett university","delhi airport",59);
        fareshow(start,end,"bennett university","select citywalk mall",51);
        fareshow(start,end,"bennett university","dlf promenade",58);
        fareshow(start,end,"bennett university","dlf emporio",57);
        fareshow(start,end,"bennett university","ambience mall",58);
        fareshow(start,end,"bennett university","radisson blu hotel",56);
        fareshow(start,end,"bennett university","pacific mall",65);
        fareshow(start,end,"bennett university","tdi mall",64);
        fareshow(start,end,"bennett university","city square mall",64);
        fareshow(start,end,"bennett university","metro walk mall",69);
        fareshow(start,end,"bennett university","dlf city centre mall",66);
        fareshow(start,end,"bennett university","v3s mall",47);
        fareshow(start,end,"bennett university","cross river mall",52);
        fareshow(start,end,"bennett university","the chanakya mall",51);
        fareshow(start,end,"bennett university","hauz khas metro station",52);
    }

    private void fareshow(String start,String end,String starting,String ending,double dis)
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
            uberfare.setText(Integer.toString((int)buy));
            olafare.setText((Integer.toString((int) (buy+(100.0*Math.random())))));
        }
    }

}
