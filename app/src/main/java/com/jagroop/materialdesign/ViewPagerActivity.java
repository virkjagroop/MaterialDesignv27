package com.jagroop.materialdesign;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.jagroop.materialdesign.Adapters.SlideShowAdapter;

import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class ViewPagerActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private SlideShowAdapter adapter;
    private CircleIndicator indicator;
    private Handler handler;
    private Runnable runnable;
    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        toolbar = findViewById(R.id.viewPagerToolbar);
        indicator = findViewById(R.id.circleIndicator);
        toolbar.setTitle("Image Slide Show");
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewPager);

        adapter = new SlideShowAdapter(this);

        viewPager.setAdapter(adapter);

        //view cicle indicator
        indicator.setViewPager(viewPager);

        handler = new Handler();

        runnable = new Runnable() {
            @Override
            public void run() {

                int i = viewPager.getCurrentItem();
                if (i == adapter.getCount() - 1) {
                     i = 0;
                     viewPager.setCurrentItem(i);
                } else {
                    i++;
                    viewPager.setCurrentItem(i);
                }

            }
        };

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(runnable);
            }
        }, 2000, 2000);
    }
}
