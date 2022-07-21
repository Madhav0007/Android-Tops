package com.example.assignmentmodule3_2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txt1,txt2;
Button btn1;
RelativeLayout rl1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=findViewById(R.id.txt1);
        txt2=findViewById(R.id.txt2);
        rl1=findViewById(R.id.rl1);
        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txt2.getText().equals("TEAL COLOR")){
                    txt2.setText("RED COLOR");
                    rl1.setBackgroundColor(Color.RED);

                }
                else {
                txt2.setText("BLUE COLOR");
                }
            }
        });
    }
}