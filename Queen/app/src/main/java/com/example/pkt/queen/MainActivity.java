package com.example.pkt.queen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSong(View view){

        Intent intent = new Intent(this,songsActivity.class);
        startActivity(intent);

    }

    public void onClickWallpapers(View view){

        Intent intent1 = new Intent(this,wallpaperActivity.class);
        startActivity(intent1);
    }

    public void onClickLyrics(View view){

        Intent intent2 = new Intent(this,LyricsActivity.class);
        startActivity(intent2);

    }

    public void toFavoriteActivity(View view){

        Intent intent3 = new Intent(this,favoriteActivity.class);
        startActivity(intent3);

    }
}
