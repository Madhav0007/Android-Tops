package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edt1,edt2,edt3,edt4;
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1=findViewById(R.id.name);
        edt2=findViewById(R.id.email);
        edt3=findViewById(R.id.passw);
        edt4=findViewById(R.id.cpassw);
        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=edt1.getText().toString();
                String email=edt2.getText().toString();
                String passw=edt3.getText().toString();
                String cpassw=edt4.getText().toString();
                if (passw.equals(cpassw)){
                    Intent i=new Intent(MainActivity.this,MainActivity2.class);
i.putExtra("n1",name);
i.putExtra("n2",passw);
i.putExtra("n3",cpassw);
startActivity(i);

                }
                Toast.makeText(MainActivity.this, "password and confirm password must be same", Toast.LENGTH_SHORT).show();
            }
        });

    }
}