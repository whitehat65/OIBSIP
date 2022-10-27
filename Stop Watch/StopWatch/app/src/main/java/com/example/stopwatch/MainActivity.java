package com.example.stopwatch;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int seconds = 0;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startTV();

    }
    public void onStart(View view){

        running = true;
    }

    public void onSTOP(View view){

        running = false;
    }
    public void onHold(View view){

        running =false;
        seconds = 0;
    }
    private void  startTV() {

        final TextView TV =findViewById(R.id.TV);
        final Handler handler =  new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hrs = seconds/3600;
                int min = (seconds%3600)/60;
                int sec = seconds%60;
                String time = String.format("%02d:%02d:%02d",hrs,min,sec);
                TV.setText(time);
                if(running){
                    seconds++;
                }
                handler.postDelayed(this::run,0);
            }
        });
    }
}