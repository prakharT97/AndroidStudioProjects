package com.example.pkt.queen;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class sheerheartattack extends AppCompatActivity {


    String q1songs[] = {"Brighton rock","Killer Queen","Tenement Funster", "Flick of the wrist","Lily of the Valley", "Now I'm here"};
    SharedPreferences.Editor favedit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queen1);
        SharedPreferences fav = getSharedPreferences("favoritelist", MODE_PRIVATE);
        favedit = fav.edit();



        ListAdapter q1 = new CustomSongAdapter(this,q1songs);
        ListView q1list = (ListView) findViewById(R.id.queen1_list);
        q1list.setAdapter(q1);


        q1list.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String songname = String.valueOf(parent.getItemAtPosition(position));
                        if (songname.equals("Brighton rock")) {
                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=JofwEB9g1zg");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        } else if (songname.equals("Killer Queen")) {
                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=oU7rqB9E_0M");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);

                        } else if (songname.equals("Tenement Funster")) {

                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=VeVjEg4znQk");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        } else if (songname.equals("Flick of the wrist")) {
                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=4V3ZH_F-YnI");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);

                        } else if (songname.equals("Lily of the Valley")) {
                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=VHC85XWII7E");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);

                        } else if (songname.equals("ow I'm here")) {
                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=dCPQS_sKJXQ");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);

                        } else if (songname.equals("Modern times rock 'n' roll")) {
                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=oU7rqB9E_0M");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);

                        }

                    }
                }
        );


        q1list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String songname = String.valueOf(parent.getItemAtPosition(position));
                if (songname.equals("Brighton rock")) {
                    favedit.putString("sh1", songname);
                    favedit.apply();
                } else if (songname.equals("Killer Queen")) {
                    favedit.putString("sh2", songname);
                    favedit.apply();

                } else if (songname.equals("Tenement Funster")) {

                    favedit.putString("sh3", songname);
                    favedit.apply();
                } else if (songname.equals("Flick of the wrist")) {
                    favedit.putString("sh4", songname);
                    favedit.apply();

                } else if (songname.equals("Lily of the Valley")) {
                    favedit.putString("sh5", songname);
                    favedit.apply();

                } else if (songname.equals("ow I'm here")) {
                    favedit.putString("sh6", songname);
                    favedit.apply();

                } else if (songname.equals("Modern times rock 'n' roll")) {
                    favedit.putString("sh7", songname);
                    favedit.apply();

                }

                return true;
            }
        });
    }
}
