package com.example.myapplication9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    CheckBox chk1,chk2;
    RadioButton rb1,rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chk1=findViewById(R.id.chk1);
        chk2=findViewById(R.id.chk2);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);

        chk1.setOnCheckedChangeListener(this);
        chk2.setOnCheckedChangeListener(this);
        rb1.setOnCheckedChangeListener(this);
        rb2.setOnCheckedChangeListener(this);

         /* chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(chk1.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Java", Toast.LENGTH_SHORT).show();
                }
            }
        });
        chk2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(chk2.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Android", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(rb1.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Male", Toast.LENGTH_SHORT).show();
                }
            }
        });
        rb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(rb2.isChecked())
                {
                    Toast.makeText(MainActivity.this, "Female", Toast.LENGTH_SHORT).show();
                }
            }
        });*/

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b)
    {
        if(chk1.isChecked())
        {
            Toast.makeText(MainActivity.this, "Java", Toast.LENGTH_SHORT).show();
        }
        if(chk2.isChecked())
        {
            Toast.makeText(MainActivity.this, "Android", Toast.LENGTH_SHORT).show();
        }
        if(rb1.isChecked())
        {
            Toast.makeText(MainActivity.this, "Male", Toast.LENGTH_SHORT).show();
        }
        if(rb2.isChecked())
        {
            Toast.makeText(MainActivity.this, "Female", Toast.LENGTH_SHORT).show();
        }
    }
    public  void  tops(View view)
    {
        Toast.makeText(MainActivity.this, "Button clicked", Toast.LENGTH_SHORT).show();
    }
}