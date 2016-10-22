package com.example.yuli.kitcat;

import android.content.Intent;
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

        GoToHappy = (Button)findViewById(R.id.buttonHappy);
        GoToHappy.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Test.class);
                        startActivity(intent);
                }
        } );
        GoToSad = (Button)findViewById(R.id.buttonSad);
        GoToSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Test.class);
                startActivity(intent);
            }
        } );
        GoToBored = (Button)findViewById(R.id.buttonBored);
        GoToBored.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Test.class);
                startActivity(intent);
            }
        } );
        GoToHalloweeny = (Button)findViewById(R.id.buttonHalloweeny);
        GoToHalloweeny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Test.class);
                startActivity(intent);
            }
        } );
    }
}
