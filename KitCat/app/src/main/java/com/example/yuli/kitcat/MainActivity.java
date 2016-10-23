package com.example.yuli.kitcat;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    Button GoToHappy;
    Button GoToSad;
    Button GoToBored;
    Button GoToHalloweeny;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer sadCatMeow = MediaPlayer.create(this, R.raw.meow);
        final MediaPlayer happyCatMeow = MediaPlayer.create(this, R.raw.meow2);
        final MediaPlayer boredCatMeow = MediaPlayer.create(this, R.raw.meoww);
        final MediaPlayer hallCatMeow = MediaPlayer.create(this, R.raw.meowww);

        GoToHappy = (Button)findViewById(R.id.buttonHappy);
        GoToHappy.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Happy.class);
                        startActivity(intent);
                        happyCatMeow.start();
                }
        } );
        GoToSad = (Button)findViewById(R.id.buttonSad);
        GoToSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Sad.class);
                startActivity(intent);
                sadCatMeow.start();
            }
        } );
        GoToBored = (Button)findViewById(R.id.buttonBored);
        GoToBored.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Bored.class);
                startActivity(intent);
                boredCatMeow.start();
            }
        } );
        GoToHalloweeny = (Button)findViewById(R.id.buttonHalloweeny);
        GoToHalloweeny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Halloween.class);
                startActivity(intent);
                hallCatMeow.start();
            }
        } );
    }
}
