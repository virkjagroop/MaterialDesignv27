package com.jagroop.materialdesign;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class CollapsingToolbarActivity extends AppCompatActivity {

    Toolbar toolbarCollapsing;
    FloatingActionButton fab_collapsing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar);

        toolbarCollapsing = findViewById(R.id.toolbar_collasing);
        setSupportActionBar(toolbarCollapsing);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        fab_collapsing = findViewById(R.id.fab_collapsing);
        fab_collapsing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CollapsingToolbarActivity.this, "Fab button on collapsing toolbar", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
