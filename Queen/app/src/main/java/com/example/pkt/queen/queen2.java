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

public class queen2 extends AppCompatActivity {


    String q2songs[] = {"Procession", "Father to son", "White Queen", "Some Day one day", "The loser in the end", "Ogre battle", "The fairy Feller's master-stroke","Nevermore", "The march of the black queen", "Funny how love is", "Seven seas of rhye"};
    SharedPreferences.Editor favedit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queen2);
        SharedPreferences fav = getSharedPreferences("favoritelist", MODE_PRIVATE);
        favedit = fav.edit();

        ListAdapter q2 = new CustomSongAdapter(this,q2songs);
        ListView q2list = (ListView) findViewById(R.id.queen2_list);
        q2list.setAdapter(q2);

        q2list.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String songname = String.valueOf(parent.getItemAtPosition(position));
                        if (songname.equals("Procession")) {
                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=JofwEB9g1zg");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        } else if (songname.equals("Father to son")) {
                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=oU7rqB9E_0M");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);

                        } else if (songname.equals("White Queen")) {

                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=VeVjEg4znQk");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        } else if (songname.equals("Some Day one day")) {

                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=VeVjEg4znQk");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        } else if (songname.equals("The loser in the end")) {

                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=VeVjEg4znQk");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        } else if (songname.equals("Ogre battle")) {

                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=VeVjEg4znQk");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        } else if (songname.equals("The fairy Feller's master-stroke")) {

                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=VeVjEg4znQk");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        } else if (songname.equals("Nevermore")) {

                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=VeVjEg4znQk");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        } else if (songname.equals("The march of the black queen")) {

                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=VeVjEg4znQk");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }


                    }
                }
        );


        q2list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String songname = String.valueOf(parent.getItemAtPosition(position));
                if (songname.equals("Procession")) {
                    favedit.putString("q21",songname);
                    favedit.apply();
                } else if (songname.equals("Father to son")) {
                    favedit.putString("q22",songname);
                    favedit.apply();

                } else if (songname.equals("White Queen")) {

                    favedit.putString("q23",songname);
                    favedit.apply();
                } else if (songname.equals("Some Day one day")) {

                    favedit.putString("q24",songname);
                    favedit.apply();
                } else if (songname.equals("The loser in the end")) {

                    favedit.putString("q25",songname);
                    favedit.apply();
                } else if (songname.equals("Ogre battle")) {
                    favedit.putString("q26",songname);
                    favedit.apply();
                } else if (songname.equals("The fairy Feller's master-stroke")) {

                    favedit.putString("q27",songname);
                    favedit.apply();
                } else if (songname.equals("Nevermore")) {

                    favedit.putString("q28",songname);
                    favedit.apply();
                } else if (songname.equals("The march of the black queen")) {

                    favedit.putString("q29",songname);
                    favedit.apply();
                }
                return true;
            }
        });
    }
}
