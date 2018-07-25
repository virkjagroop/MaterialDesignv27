package com.jagroop.materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class ToolbarActivity extends AppCompatActivity {
    private static final String TAG = "ToolbarActivity";

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        toolbar = findViewById(R.id.toolBar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.menuSettings) {
            Toast.makeText(this, "Settings menu", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.menuHelp) {
            Toast.makeText(this, "Help menu", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.menuAbout) {
            Toast.makeText(this, "About menu", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.menuCart) {
            Toast.makeText(this, "Cart menu", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.menuSearch) {
            Toast.makeText(this, "Search menu", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

