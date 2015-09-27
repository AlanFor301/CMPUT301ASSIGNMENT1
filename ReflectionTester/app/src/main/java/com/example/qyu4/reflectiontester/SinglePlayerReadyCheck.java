package com.example.qyu4.reflectiontester;

import android.app.Activity;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class SinglePlayerReadyCheck extends Activity {
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_player_ready_check);
        final Button singleReadyButton = (Button) findViewById(R.id.b_single_player_ready);
        
    }

}
