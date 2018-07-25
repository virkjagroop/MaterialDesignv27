package com.jagroop.materialdesign;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class ProgressBarActivity extends AppCompatActivity {

    private Handler handler;
    private Runnable runnable;
    private Timer timer;
    private ProgressBar progressBarCircle, pbLinear_in, pbLinear_de, pbLinear_dual, pbLinear_back;
    private int i = 0, j = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        progressBarCircle = findViewById(R.id.progressBarCircle);
        pbLinear_in = findViewById(R.id.pbLinear_in);
        pbLinear_de = findViewById(R.id.pbLinear_de);
        pbLinear_dual = findViewById(R.id.pbLinear_dual);
        pbLinear_back = findViewById(R.id.pbLinear_back);

        pbLinear_de.setProgress(0);
        pbLinear_de.setMax(100);

        pbLinear_dual.setProgress(0);
        pbLinear_dual.setSecondaryProgress(0);
        pbLinear_dual.setMax(100);

        pbLinear_back.setProgress(100);
        pbLinear_back.setMax(100);

        handler = new Handler();

        runnable = new Runnable() {
            @Override
            public void run() {
                if (++i<=100) {
                    pbLinear_de.setProgress(i);
                    pbLinear_dual.setProgress(i);
                    pbLinear_dual.setSecondaryProgress(i+10);
                } else {
                    timer.cancel();
                    progressBarCircle.setVisibility(View.INVISIBLE);
                    pbLinear_in.setVisibility(View.GONE);
                }
                if (--j>=0) {
                    pbLinear_back.setProgress(j);
                } else timer.cancel();
            }
        };

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(runnable);
            }
        }, 1000, 100);
    }
}
