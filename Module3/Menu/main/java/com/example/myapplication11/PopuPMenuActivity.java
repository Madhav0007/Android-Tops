package com.example.myapplication11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PopuPMenuActivity extends AppCompatActivity {
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popu_pmenu);
        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popuPMenu=new PopupMenu(PopuPMenuActivity.this,btn1);
                popuPMenu.getMenuInflater().inflate(R.menu.popup_menu,popuPMenu.getMenu());
                popuPMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {

                        switch(menuItem.getItemId())
                        {
                            case R.id.i1:
                                Toast.makeText(PopuPMenuActivity.this, "200", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.i2:
                                Toast.makeText(PopuPMenuActivity.this, "250", Toast.LENGTH_SHORT).show();
                                break;

                        }

                        return false;
                    }
                });

                popuPMenu.show();
            }
        });
    }
}