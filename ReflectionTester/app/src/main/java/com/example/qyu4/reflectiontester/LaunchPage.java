package com.example.qyu4.reflectiontester;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LaunchPage extends Activity {
    private Handler handler =  new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launch_page);
        handler.postDelayed(new Runnable() {
            public void run() {
                Intent openNewActivity = new Intent(getApplicationContext(), NumberChooseActivity.class);
                startActivity(openNewActivity);
            }
        }, 2000);
    }


}
