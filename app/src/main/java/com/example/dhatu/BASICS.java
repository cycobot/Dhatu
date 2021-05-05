package com.example.dhatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class BASICS extends AppCompatActivity {
    private ImageButton bt;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_a_s_i_c_s);
        ImageView option1 = (ImageView) findViewById(R.id.imageButton);
        mp = MediaPlayer.create(this, R.raw.sound);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sound);
        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(BASICS.this,Correct.class);
                startActivity(i);
                mp.start();
            }
        });
        ImageView option2 = (ImageView) findViewById(R.id.imageButton2);
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(BASICS.this,Wrong.class);
                startActivity(i);
                mp.start();
            }
        });
        ImageView option3 = (ImageView) findViewById(R.id.imageButton3);
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(BASICS.this,Wrong.class);
                startActivity(i);
                mp.start();
            }
        });
        ImageView option4 = (ImageView) findViewById(R.id.imageButton4);
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(BASICS.this,Wrong.class);
                startActivity(i);
                mp.start();
            }
        });
    }
}