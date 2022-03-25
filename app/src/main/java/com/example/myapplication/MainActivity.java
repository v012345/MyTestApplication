package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stop = findViewById(R.id.bye);
        start = findViewById(R.id.start);
        stop.setOnClickListener(this);
        start.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == start) {
            Log.d("fe","ijfe");
            startService(new Intent(this, BackgroundService.class));
        }
        if (v == stop) {
            Log.d("fe","ijfe");
            stopService(new Intent(this, BackgroundService.class));
        }
    }
}