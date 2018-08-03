package com.jagroop.materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import com.appyvet.materialrangebar.RangeBar;

public class SeekBarActivity extends AppCompatActivity {

    SeekBar seekBar;
    RangeBar rangeBar1, rangeBar2;
    TextView seekBar_tv, rangebar1_tv, rangeBar2_tv_left, rangeBar2_tv_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);

        seekBar = findViewById(R.id.seekBar);
        rangeBar1 = findViewById(R.id.rangeBar1);
        rangeBar2 = findViewById(R.id.rangeBar2);
        seekBar_tv = findViewById(R.id.seekBar_tv);
        rangebar1_tv = findViewById(R.id.rangeBar1_tv);
        rangeBar2_tv_left = findViewById(R.id.rangeBar2_tv_left);
        rangeBar2_tv_right = findViewById(R.id.rangeBar2_tv_right);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekBar_tv.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        rangeBar1.setOnRangeBarChangeListener(new RangeBar.OnRangeBarChangeListener() {
            @Override
            public void onRangeChangeListener(RangeBar rangeBar, int leftPinIndex, int rightPinIndex, String leftPinValue, String rightPinValue) {
                rangebar1_tv.setText(rightPinValue);
            }
        });

        rangeBar2.setOnRangeBarChangeListener(new RangeBar.OnRangeBarChangeListener() {
            @Override
            public void onRangeChangeListener(RangeBar rangeBar, int leftPinIndex, int rightPinIndex, String leftPinValue, String rightPinValue) {
                rangeBar2_tv_left.setText(leftPinValue);
                rangeBar2_tv_right.setText(rightPinValue);
            }
        });
    }
}
