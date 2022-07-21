package com.example.myapplication8;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {
    CheckBox chk1,chk2,chk3;
    Button btn1;
    ImageButton btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        chk1=findViewById(R.id.chk1);
        chk2=findViewById(R.id.chk2);
        chk3=findViewById(R.id.chk3);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder builder=new StringBuilder();
                builder.append("\n Selected Items \n");
                int amount=0;

                if(chk1.isChecked())
                {
                    amount+=100;
                    builder.append("\n Pizza @ rs.100 \n");
                }
                if(chk2.isChecked())
                {
                    amount+=70;
                    builder.append("\n Burger @ rs.70 \n");
                }
                if(chk3.isChecked())
                {
                    amount+=120;
                    builder.append("\n Coffee @ rs.120 \n");
                }
                builder.append("----------------------------");
                builder.append("\n Total is "+amount);

                //Toast.makeText(MainActivity2.this, ""+builder.toString(), Toast.LENGTH_LONG).show();
                Intent i =new Intent(MainActivity2.this,MainActivity3.class);
                i.putExtra("Bill",builder.toString());
                startActivity(i);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number="8511872690";
                Intent i=new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:"+number));
                startActivity(i);
            }
        });

    }

    @Override
    public void onBackPressed()
    {
        AlertDialog.Builder alert =new AlertDialog.Builder(MainActivity2.this);
        alert.setTitle("Are you sure you want to exit?");
        alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finishAffinity();
            }
        } );
        alert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.cancel();
            }
        });
        alert.show();
    }
    }
