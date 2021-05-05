package com.example.dhatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class learningmap extends AppCompatActivity {
    private Button originBtn;
    private Button quizBtn;
    private Button gunithaBtn;
    private Button quiz1Btn;
    private Button shabdhaBtn;
    private Button quiz3Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learningmap);

        originBtn= (Button) findViewById(R.id.button3);
        originBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(learningmap.this, BASICS.class));

            }
        });
        quizBtn = (Button) findViewById(R.id.button4);
        quizBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(learningmap.this, SENTENCES.class));
            }
        });
        gunithaBtn = (Button) findViewById(R.id.button5);
        gunithaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(learningmap.this, GREETINGS.class));
            }
        });
        quiz1Btn = (Button) findViewById(R.id.button6);
        quiz1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(learningmap.this, PEOPLE.class));
            }
        });
        shabdhaBtn = (Button) findViewById(R.id.button8);
        shabdhaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(learningmap.this, PLACES.class));
            }
        });
        quiz3Btn = (Button) findViewById(R.id.button7);
        quiz3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(learningmap.this, PEOPLE2.class));
            }
        });
    }
}