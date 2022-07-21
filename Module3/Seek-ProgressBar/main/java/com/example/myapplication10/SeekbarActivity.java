package com.example.myapplication10;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class SeekbarActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
SeekBar seek1,seek2,seek3;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);
        seek1=findViewById(R.id.seek1);
        seek2=findViewById(R.id.seek2);
        seek3=findViewById(R.id.seek3);
        imageView=findViewById(R.id.img);

        seek1.setOnSeekBarChangeListener(this);
        seek2.setOnSeekBarChangeListener(this);
        seek3.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b)
    {
        int r=seek1.getProgress();
        int g=seek2.getProgress();
        int b1=seek3.getProgress();

        imageView.setBackgroundColor(Color.rgb(r,g,b1));


    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}