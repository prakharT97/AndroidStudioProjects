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

public class queen1 extends AppCompatActivity {


    String q1songs[] = {"Keep yourself alive", "Liar", "My fairy king", "Doing alright", "Great King rat", "The night comes down", "Modern times rock 'n' roll", "Son and daughter", "Jesus", "Seven seas of rhye"};
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
                        if (songname.equals("Keep yourself alive")) {
                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=JofwEB9g1zg");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        } else if (songname.equals("Liar")) {
                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=oU7rqB9E_0M");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);

                        } else if (songname.equals("My fairy king")) {

                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=VeVjEg4znQk");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        } else if (songname.equals("Doing alright")) {
                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=4V3ZH_F-YnI");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);

                        } else if (songname.equals("Great King rat")) {
                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=VHC85XWII7E");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);

                        } else if (songname.equals("The night comes down")) {
                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=dCPQS_sKJXQ");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);

                        } else if (songname.equals("Modern times rock 'n' roll")) {
                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=oU7rqB9E_0M");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);

                        } else if (songname.equals("Son and daughter")) {
                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=oU7rqB9E_0M");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);

                        } else if (songname.equals("Jesus")) {
                            Uri uri = Uri.parse("https://www.youtube.com/watch?v=oU7rqB9E_0M");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);

                        } else if (songname.equals("Seven seas of rhye")) {
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
                if (songname.equals("Keep yourself alive")) {

                    favedit.putString("q11",songname);
                    favedit.apply();



                } else if (songname.equals("Liar")) {
                    favedit.putString("q12",songname);

                    favedit.apply();

                } else if (songname.equals("My fairy king")) {

                    favedit.putString("q13",songname);
                    favedit.apply();
                } else if (songname.equals("Doing alright")) {
                    favedit.putString("q14",songname);
                    favedit.apply();

                } else if (songname.equals("Great King rat")) {
                    favedit.putString("q15",songname);
                    favedit.apply();

                } else if (songname.equals("The night comes down")) {
                    favedit.putString("q16",songname);
                    favedit.apply();

                } else if (songname.equals("Modern times rock 'n' roll")) {
                    favedit.putString("q17",songname);
                    favedit.apply();

                } else if (songname.equals("Son and daughter")) {
                    favedit.putString("q18",songname);
                    favedit.apply();

                } else if (songname.equals("Jesus")) {
                    favedit.putString("q19",songname);
                    favedit.apply();

                } else if (songname.equals("Seven seas of rhye")) {
                    favedit.putString("q20",songname);
                    favedit.apply();

                }

                return true;
            }
        });
    }
}
