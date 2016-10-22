package com.example.yuli.kitcat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.*;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE="com.example.yuli.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView=new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        ViewGroup layout=(ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);
    }
    public void sendMessage(View view) {
        Intent intent=new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message=editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }

}