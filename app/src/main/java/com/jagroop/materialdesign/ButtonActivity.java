package com.jagroop.materialdesign;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    private Button raised_btn;
    private AppCompatButton flat_btn;
    private FloatingActionButton fab_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        raised_btn = findViewById(R.id.raised_btn);
        flat_btn = findViewById(R.id.flat_btn);
        fab_btn = findViewById(R.id.fab_btn);

        raised_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "Raised", Toast.LENGTH_SHORT).show();
            }
        });

        flat_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "Flat", Toast.LENGTH_SHORT).show();
            }
        });

        fab_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "FAB", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
