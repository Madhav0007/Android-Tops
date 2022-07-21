package com.example.myapplication9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListDataActivity extends AppCompatActivity {
    ListView listView;
    List<String> list;
    SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_data);

        listView=findViewById(R.id.list);
        list=new ArrayList<>();
        searchView=findViewById(R.id.search);

        list.add("Heet");
        list.add("Dhruvil");
        list.add("Madhav");

        ArrayAdapter arrayAdapter=new ArrayAdapter(ListDataActivity.this, android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query)
            {
              /*  if(list.contains(query))
                {
                    arrayAdapter.getFilter().filter(query);
                }*/
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText)
            {
                arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(ListDataActivity.this, ""+i, Toast.LENGTH_SHORT).show();
                if(i==0)
                {

                }
                if(i==1)
                {

                }
                if(i==2)
                {

                }
            }
        });


    }
}