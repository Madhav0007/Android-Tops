package com.example.myapplication4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edt1,edt2,edt3,edt4,edt5;
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1=findViewById(R.id.fname);
        edt2=findViewById(R.id.lname);
        edt3=findViewById(R.id.email);
        edt4=findViewById(R.id.password);
        edt5=findViewById(R.id.cpass);
        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname=edt1.getText().toString();
                String lname=edt2.getText().toString();
                String email=edt3.getText().toString();
                String pass=edt4.getText().toString();
                String cpass=edt5.getText().toString();
                if (pass.equals(cpass))
                {
                    Intent i=new Intent(MainActivity.this,MainActivity2.class);
                    i.putExtra("n1",fname);
                    i.putExtra("l1",lname);
                    i.putExtra("e1",email);
                    startActivity(i);
                }
                else {
                    Toast.makeText(MainActivity.this, "Password and Confirm password must be same", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}