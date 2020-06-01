package com.example.pkt.queen;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Map;

public class favoriteActivity extends AppCompatActivity {


    String values[] = new String[100];
    int i=0;
    ListView q1list;
    SharedPreferences.Editor favedit;
    SharedPreferences fav;

    protected void createlist(){

        ListAdapter q1 = new CustomSongAdapter(this,values);
        q1list.setAdapter(q1);

    }

    protected void favlistcreator(){
        fav = getSharedPreferences("favoritelist",MODE_PRIVATE);

        int index = 0;
        for(index=0;index<100;index++){
            values[index]="";
        }
        index=0;
        Map<String,?> allPrefs = fav.getAll();

        for(Map.Entry<String,?> entry : allPrefs.entrySet()){
            values[index] = entry.getValue().toString();
            index++;
        }


        createlist();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        q1list = (ListView) findViewById(R.id.favorite_list);
        favlistcreator();
        q1list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String songname = String.valueOf(parent.getItemAtPosition(position));
                favedit = fav.edit();
                Map<String,?> allPrefs = fav.getAll();

                for(Map.Entry<String,?> entry : allPrefs.entrySet()){
                   if(entry.getValue().toString().equals(songname)){

                       favedit.remove(entry.getKey());
                       favedit.apply();
                       break;
                   }

                }

                favlistcreator();

                return true;
            }
        });





    }
}
