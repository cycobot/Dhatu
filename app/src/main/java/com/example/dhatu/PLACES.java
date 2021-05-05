package com.example.dhatu;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PLACES extends AppCompatActivity {
    private Button ring;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        ring = findViewById(R.id.ring);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.sound);

        ring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaPlayer.start();
            }
        });
    }
}