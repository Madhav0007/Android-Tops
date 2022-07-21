package com.example.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=findViewById(R.id.img1);
        t2=findViewById(R.id.img2);
        t3=findViewById(R.id.img3);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "DHONI", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
            }
        });

        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "VIRAT KOHLI", Toast.LENGTH_SHORT).show();
                Intent i2=new Intent(MainActivity.this,MainActivity3.class);
                startActivity(i2);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "SACHIN TENDULKAR", Toast.LENGTH_SHORT).show();
                Intent i3=new Intent(MainActivity.this,MainActivity4.class);
                startActivity(i3);
            }
        });
    }
}