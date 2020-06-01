package com.example.pkt.queen;

import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class wallpaperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);
    }

    public void onClickimg1(View view){

        Intent intent = new Intent(this,imgViewActivity.class);
        intent.putExtra("IMAGE","img1");
        startActivity(intent);

    }

    public void onClickimg2(View view){

        Intent intent = new Intent(this,imgViewActivity.class);
        intent.putExtra("IMAGE","img2");
        startActivity(intent);

    }
}
