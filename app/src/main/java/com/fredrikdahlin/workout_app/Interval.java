package com.fredrikdahlin.workout_app;

/**
 * Created by Fredrik on 2016-07-16.
 */
public class Interval extends Activity {
    Integer LAPS = 0;
    Integer ACTIVE_TIME = 0;
    Integer REST_TIME = 0;


    public void Interval(Integer active, Integer rest, Integer laps) {
        ACTIVE_TIME = active;
        REST_TIME = rest;
        LAPS = laps;
    }


    public void run() {

    }


    public void pause() {

    }
}
