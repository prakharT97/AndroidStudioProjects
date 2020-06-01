package com.example.pkt.queen;


import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CustomSongAdapter extends ArrayAdapter<String> {

    String songs[];
    TextView albumname;

    CustomSongAdapter(Context context,String[] songs){

        super(context,R.layout.customsongrow,songs);
        this.songs = songs;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater albumInflater = LayoutInflater.from(getContext());
        View customview = albumInflater.inflate(R.layout.customsongrow,parent,false);

        String singlealbum = getItem(position);
        albumname = (TextView) customview.findViewById(R.id.song_name);
        /*CheckBox isFavorite = (CheckBox)customview.findViewById(R.id.favorite_check);*/
        albumname.setText(singlealbum);
        /*isFavorite.setText("Favorite?");*/


        return customview;


    }

    /*public void addToFavorite(View view){

        CheckBox checkBox = (CheckBox)view;
        if(checkBox.isChecked()){
            Intent i = new Intent(getContext(),favoriteActivity.class);
            i.putExtra("SONG",albumname.getText());
            getContext().startActivity(i);


        }
    }*/
}