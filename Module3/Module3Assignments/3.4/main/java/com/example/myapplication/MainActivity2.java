package com.example.myapplication;

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
String n1=i.getStringExtra("n1");
String n2=i.getStringExtra("n2");
String n3=i.getStringExtra("n3");



        txt1.setText("your name is:"+n1);
        txt2.setText("your email is:"+n2);
        txt3.setText("your password is:"+n3);
    }
}