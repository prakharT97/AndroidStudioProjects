package com.example.pkt.queen;


import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CustomAdapter extends ArrayAdapter<String> {

    String albums[];

    CustomAdapter(Context context,String[] albums){

        super(context,R.layout.customrow,albums);
        this.albums = albums;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater albumInflater = LayoutInflater.from(getContext());
        View customview = albumInflater.inflate(R.layout.customrow,parent,false);

        String s = albums[position];


            String singlealbum = getItem(position);
            TextView albumname = (TextView) customview.findViewById(R.id.albumname);
            ImageView albumimage = (ImageView)customview.findViewById(R.id.albumimage);
            albumname.setText(singlealbum);
        if (s.equals("(1973)Queen")) {
            albumimage.setImageResource(R.drawable.img1);
        } else if (s.equals("(1974-1)QueenII")) {
            albumimage.setImageResource(R.drawable.img2);
        }else if (s.equals("Sheer Heart Attack")) {
            albumimage.setImageResource(R.drawable.img3);
        }

        return customview;


    }
}
