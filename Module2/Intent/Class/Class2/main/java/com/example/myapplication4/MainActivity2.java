package com.example.myapplication4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView txt1,txt2,txt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        txt3=findViewById(R.id.txt3);
        Intent i=getIntent();
        String n=i.getStringExtra("n1");
        String l=i.getStringExtra("l1");
        String e=i.getStringExtra("e1");

        txt1.setText("your first name is:"+n);
        txt2.setText("your last name is:"+l);
        txt3.setText("your email is:"+e);
    }
}