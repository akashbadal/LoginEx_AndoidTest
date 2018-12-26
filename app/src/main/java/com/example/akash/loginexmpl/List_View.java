package com.example.akash.loginexmpl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

// this acitvity is used to view the content as a list form


public class List_View extends AppCompatActivity {

    private static ListView listView;
    private static String[] names ={"akash","setu","fazil","surya","ankit"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__view);
        namelist();
    }

    public void namelist(){
        listView =(ListView)findViewById(R.id.name_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.layout_listview,names);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String value = (String)listView.getItemAtPosition(position);
                        Toast.makeText(List_View.this,"Position:"+ position +"Value: "+ value,Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }
}
