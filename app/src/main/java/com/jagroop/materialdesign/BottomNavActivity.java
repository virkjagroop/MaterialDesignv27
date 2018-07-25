package com.jagroop.materialdesign;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenu;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class BottomNavActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView  bottom_navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);

        bottom_navigation = findViewById(R.id.bottom_navigation);


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.inbox) {
            Toast.makeText(this, "Inbox", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.sent) {
            Toast.makeText(this, "Sent", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.stared) {
            Toast.makeText(this, "Stared", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.spam) {
            Toast.makeText(this, "Spam", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.draft) {
            Toast.makeText(this, "Draft", Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}
