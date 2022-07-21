package com.example.myapplication10;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Spinner spinner;
    String city[]={"Rajkot","Surat","Baroda"};
    AutoCompleteTextView autoCompleteTextView;
    String name[]={"Heet","Madhav","Dhruvil","Prakruti","Python"};
    Switch aSwitch;
    MediaPlayer mediaPlayer;
    ProgressBar progressBar;
    Button btn1,btn2;
    RatingBar ratingBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spin);
        autoCompleteTextView=findViewById(R.id.auto1);
        autoCompleteTextView.setThreshold(1);
        aSwitch=findViewById(R.id.s1);
        mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.welcome_to_my_house);
        progressBar=findViewById(R.id.progress);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        ratingBar=findViewById(R.id.rate);


        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,city);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, ""+city[i], Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter arrayAdapter1=new ArrayAdapter(MainActivity.this, android.R.layout.select_dialog_item,name);
        autoCompleteTextView.setAdapter(arrayAdapter1);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(aSwitch.isChecked())
                {
                    Toast.makeText(MainActivity.this, "ON", Toast.LENGTH_SHORT).show();
                    mediaPlayer.start();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "OFF", Toast.LENGTH_SHORT).show();
                    mediaPlayer.stop();
                }

            }
        });
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

                Toast.makeText(MainActivity.this, ""+ratingBar.getRating(), Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public void onClick(View view)
    {
        if(view==btn1)
        {
            progressBar.incrementProgressBy(1);
            setProgress(100*progressBar.getProgress());
        }
        if(view==btn2)
        {
            progressBar.incrementProgressBy(-1);
            setProgress(100*progressBar.getProgress());
        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}