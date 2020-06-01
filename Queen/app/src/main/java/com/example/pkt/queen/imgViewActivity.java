package com.example.pkt.queen;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class imgViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_view);
        ImageView setWallpaperImage1 = (ImageView)findViewById(R.id.setWallpaperImage);
        Bundle wallpaperData = getIntent().getExtras();
        String wallpaperString = wallpaperData.getString("IMAGE");



        if(wallpaperData==null){return;}

        else if(wallpaperString.equals("img1")){

            setWallpaperImage1.setImageResource(R.drawable.img1);


        }
        else if(wallpaperString.equals("img2")){

            setWallpaperImage1.setImageResource(R.drawable.img2);

        }


    }

    public void setWallpaper(View view){

        Bundle wallpaperData = getIntent().getExtras();
        String wallpaperString = wallpaperData.getString("IMAGE");
        WallpaperManager myWallpaperManager = WallpaperManager.getInstance(getApplicationContext());
        if(wallpaperString.equals("img1")){

            Bitmap mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.img1);
            try {
                myWallpaperManager.setBitmap(mBitmap);
                Toast.makeText(this, "Wallpaper set",
                        Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(this,
                        "Error setting wallpaper", Toast.LENGTH_SHORT)
                        .show();
            }

        }
        else if(wallpaperString.equals("img2")){

            Bitmap mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.img2);
            try {
                myWallpaperManager.setBitmap(mBitmap);
                Toast.makeText(this, "Wallpaper set",
                        Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Toast.makeText(this,
                        "Error setting wallpaper", Toast.LENGTH_SHORT)
                        .show();
            }

        }


    }

}
