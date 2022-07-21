package com.example.myapplication6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText edt1,edt2;
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1=findViewById(R.id.edt1);
        edt2=findViewById(R.id.edt2);
        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum=Integer.parseInt(edt1.getText().toString())+Integer.parseInt(edt2.getText().toString());
                String num=Integer.toString(sum);
                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("sum",num);
                startActivity(i);
            }
        });
    }
}