package com.fredrikdahlin.workout_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class WorkOutOverview extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.fredrikdahlin.tutorialapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_out_overview);
    }


    /** Called when the user clicks the send button */
    public void addToWorkOut(View view) {
        // Do something in response to click
        Intent intent = new Intent(this, IntervalCreator.class);
        startActivity(intent);
    }
}
