package com.example.dhatu;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageButton;

public class PEOPLE extends AppCompatActivity {
    private ImageButton ABtn;
    private ImageButton BBtn;
    private ImageButton CBtn;
    private ImageButton DBtn;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);
        /*mp = MediaPlayer.create(this, R.raw.sound);
        //ABtn= (ImageButton) findViewById(R.id.imageView5);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sound);
        ABtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    mp.start();

                startActivity(new Intent(quiz1.this, Correct.class));

            }
        });
        //BBtn = (Button) findViewById(R.id.button12);
        BBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                startActivity(new Intent(quiz1.this, Wrong.class));
            }
        });
        //CBtn = (Button) findViewById(R.id.button13);
        CBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                startActivity(new Intent(quiz1.this, Wrong.class));
            }
        });
        //DBtn = (Button) findViewById(R.id.button14);
        DBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
                startActivity(new Intent(quiz1.this, Wrong.class));
            }
        });*/
    }
}