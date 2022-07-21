package com.example.myapplication8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        linearLayout=new LinearLayout(MainActivity.this);

        TextView textView=new TextView(MainActivity.this);
        textView.setText("Hello");

        int width=LinearLayout.LayoutParams.MATCH_PARENT;
        int height=LinearLayout.LayoutParams.WRAP_CONTENT;

        linearLayout.addView(textView,width,height);
        setContentView(linearLayout);

    }
}