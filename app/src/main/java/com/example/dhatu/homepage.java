package com.example.dhatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homepage extends AppCompatActivity {
    private Button learningBtn;
    private Button thesaurusBtn;
    private Button grammarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        learningBtn = (Button) findViewById(R.id.button);
        learningBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homepage.this, learningmap.class));
            }
        });
        thesaurusBtn = (Button) findViewById(R.id.button2);
        thesaurusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homepage.this, thesaures.class));
            }
        });
        grammarBtn = (Button) findViewById(R.id.grammer);
        grammarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homepage.this, grammar.class));
            }
        });
    }
}
