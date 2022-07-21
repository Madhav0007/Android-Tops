package com.example.myapplication7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txt1,txt2;
ImageButton imgbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        imgbtn=findViewById(R.id.imgbtn);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt1.getText().equals("PLAY BUTTON")) {
                    txt1.setText("PAUSE BUTTON");
                    imgbtn.setImageResource(R.drawable.pause);
                }
                else {
                    txt1.setText("PLAY BUTTON");
                    imgbtn.setImageResource(R.drawable.play);
                }
            }
        });
    }
}