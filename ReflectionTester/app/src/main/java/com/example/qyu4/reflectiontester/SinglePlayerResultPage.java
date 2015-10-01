package com.example.qyu4.reflectiontester;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class SinglePlayerResultPage extends Activity implements OnClickListener {

    private ReactionTimeModel singleReactionTime = new ReactionTimeModel();
    public long startTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_player_result_page);
        /**http://stackoverflow.com/questions/351565/system-currenttimemillis-vs-system-nanotime
         * can be used for cal reaction time
         */
        startTime = System.nanoTime();
        Button clickButton = (Button) findViewById(R.id.b_single_player_click);

        clickButton.setOnClickListener(this);
    }


    @Override
    protected void onStart(){
        super.onStart();

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.b_single_player_click){
            //Button singleReadyButton = (Button) findViewById(R.id.b_single_player_click);
            final TextView tv = (TextView) findViewById(R.id.single_player_result);
            long estimatedTime = (System.nanoTime() - startTime) / 1000000;
            tv.setText(String.valueOf(estimatedTime));
        }
    }

}
