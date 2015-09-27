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

public class NumberChooseActivity extends Activity {
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number_choose);
        Button singleButton = (Button) findViewById(R.id.b_single_player);
        singleButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent openNewActivity = new Intent(getApplicationContext(), SinglePlayerReadyCheck.class);
                startActivity(openNewActivity);
            }
        });
    }

}
