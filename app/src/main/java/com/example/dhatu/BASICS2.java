package com.example.dhatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class BASICS2 extends AppCompatActivity {
    private ImageButton bt;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_a_s_i_c_s2);
        ImageView option1 = (ImageView) findViewById(R.id.imageButton5);
        mp = MediaPlayer.create(this, R.raw.sound);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sound);
        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(BASICS2.this,Correct2.class);
                startActivity(i);
                mp.start();
            }
        });
        ImageView option2 = (ImageView) findViewById(R.id.imageButton6);
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(BASICS2.this,Wrong2.class);
                startActivity(i);
                mp.start();
            }
        });
        ImageView option3 = (ImageView) findViewById(R.id.imageButton7);
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(BASICS2.this,Wrong2.class);
                startActivity(i);
                mp.start();
            }
        });
        ImageView option4 = (ImageView) findViewById(R.id.imageButton8);
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(BASICS2.this,Wrong2.class);
                startActivity(i);
                mp.start();
            }
        });
    }
}