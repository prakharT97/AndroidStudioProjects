package com.example.pkt.queen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SpashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash_screen);

        Thread splashTread = new Thread(){
            @Override
            public void run() {
                try{

                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();


                }catch(InterruptedException ex){

                    ex.printStackTrace();
                }
            }
        };

        splashTread.start();

    }
}
