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
import android.widget.TextView;

public class SinglePlayerResultPage extends Activity {
    private Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_player_result_page);
        final long startTime = System.nanoTime();
        Button clickButton = (Button) findViewById(R.id.b_single_player_click);
        final TextView tv = (TextView) findViewById(R.id.single_player_result);
        clickButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                long estimatedTime = (System.nanoTime() - startTime)/1000000;
                tv.setText(String.valueOf(estimatedTime));
            }
        });
    }

    /**http://stackoverflow.com/questions/351565/system-currenttimemillis-vs-system-nanotime
     * can be used for cal reaction time
     */
    @Override
    protected void onStart(){
        super.onStart();

    }
}
