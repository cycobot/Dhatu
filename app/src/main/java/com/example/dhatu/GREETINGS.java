package com.example.dhatu;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GREETINGS extends AppCompatActivity {
    private Button bt;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings);
        mp = MediaPlayer.create(this, R.raw.sound);
        bt = (Button)findViewById(R.id.button20);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sound);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
    }
}