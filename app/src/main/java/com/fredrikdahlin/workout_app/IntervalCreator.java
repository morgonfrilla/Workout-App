package com.fredrikdahlin.workout_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class IntervalCreator extends AppCompatActivity {
    String msg = "IntervalCreator : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interval_creator);
    }


    public void addInterval(View view) {
        Intent intent = new Intent(this, IntervalActivity.class);
        startActivity(intent);
    }

    public void addOTM(View view) {
        Intent intent = new Intent(this, OtmActivity.class);
        startActivity(intent);
    }

    public void addAMRAP(View view) {
        Intent intent = new Intent(this, AmrapActivity.class);
        startActivity(intent);
    }

    public void addTabata(View view) {
        Intent intent = new Intent(this, TabataActivity.class);
        startActivity(intent);
    }

    public void addTimer(View view) {
        Intent intent = new Intent(this, TimerActivity.class);
        startActivity(intent);
    }
}
