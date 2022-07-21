package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button imbtn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imbtn1=findViewById(R.id.imbtn1);
        imbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number="8511872690";
                Intent i=new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:"+number));
                startActivity(i);
            }
        });


    }
}