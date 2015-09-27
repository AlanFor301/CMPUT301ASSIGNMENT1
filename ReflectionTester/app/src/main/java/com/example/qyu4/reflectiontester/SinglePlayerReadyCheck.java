package com.example.qyu4.reflectiontester;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class SinglePlayerReadyCheck extends Activity {
    private Handler handler = new Handler();
    private int randTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_player_ready_check);
        final Button singleReadyButton = (Button) findViewById(R.id.b_single_player_ready);
        singleReadyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                randTime = randInt(10, 2000);
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Intent openNewActivity = new Intent(getApplicationContext(), NumberChooseActivity.class);
                        startActivity(openNewActivity);
                    }
                }, randTime);
            }
        });
    }

    /**
     * Alan Sep 27,2015. Creg Case. http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java
     * @param min
     * @param max
     * @return
     */
    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
