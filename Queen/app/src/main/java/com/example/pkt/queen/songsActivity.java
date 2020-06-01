package com.example.pkt.queen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class songsActivity extends AppCompatActivity {

    String[] albums = {"(1973)Queen","(1974-1)QueenII","Sheer Heart Attack"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ListAdapter adapter = new CustomAdapter(this,albums);
        ListView listView = (ListView) findViewById(R.id.album_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String albumname = String.valueOf(parent.getItemAtPosition(position));
                        if(albumname.equals("(1973)Queen")){
                           Intent i1 = new Intent(view.getContext(),queen1.class);
                            startActivity(i1);
                        }
                        else if(albumname.equals("(1974-1)QueenII")){
                            Intent i2 = new Intent(view.getContext(),queen2.class);
                            startActivity(i2);
                        }
                        else if(albumname.equals("Sheer Heart Attack")){
                            Intent i2 = new Intent(view.getContext(),queen2.class);
                            startActivity(i2);
                        }

                    }
                }
        );

    }
}
