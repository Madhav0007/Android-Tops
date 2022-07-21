package com.example.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
EditText edt1,edt2;
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        edt1=findViewById(R.id.edt1);
        edt2=findViewById(R.id.edt2);
        btn1=findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number=edt1.getText().toString();
                String pass=edt2.getText().toString();
                if (number.length()==0 && pass.length()==0)
                {
                    edt1.setError("please enter name");
                    edt2.setError("please enter password");
                }
                else if (number.length()==0)
                {
                    edt1.setError("please enter number");
                }
                else if (pass.length()==0)
                {
                    edt2.setError("please enter password");
                }
                else {
                    Toast.makeText(MainActivity4.this, "LOGIN SUCCESS", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}