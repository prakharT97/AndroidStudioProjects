package com.example.pkt.queen;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.app.SearchManager;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;

import java.util.ArrayList;
import java.util.Arrays;


public class LyricsActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics);
        lv = (ListView)findViewById(R.id.lyricSearchList);
        ArrayList<String> arraySongs = new ArrayList<>();
        arraySongs.addAll(Arrays.asList(getResources().getStringArray(R.array.songarray)));
        adapter = new ArrayAdapter<>(LyricsActivity.this,android.R.layout.simple_list_item_1,arraySongs);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.lyricsearch,menu);
        MenuItem item = menu.findItem(R.id.menuSearch);
        SearchView searchView = (SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener(){

            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                lv.setAdapter(adapter);
                return false;
            }
        });

        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String songname = String.valueOf(parent.getItemAtPosition(position));
                        if(songname.equals("Liar")){
                            Uri uri = Uri.parse("http://www.azlyrics.com/lyrics/queen/liar.html");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                        else if(songname.equals("Procession")){
                            Uri uri = Uri.parse("http://genius.com/Queen-procession-lyrics");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                        else if(songname.equals("Father to son")){
                            Uri uri = Uri.parse("http://www.azlyrics.com/lyrics/queen/fathertoson.html");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                        else if(songname.equals("Keep yourself alive")){
                            Uri uri = Uri.parse("http://www.azlyrics.com/lyrics/queen/keepyourselfalive.html");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }
                        else if(songname.equals("My fairy king")){
                            Uri uri = Uri.parse("http://www.azlyrics.com/lyrics/queen/myfairyking.html");
                            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                            startActivity(intent);
                        }

                    }
                }
        );


        return super.onCreateOptionsMenu(menu);
    }



}
