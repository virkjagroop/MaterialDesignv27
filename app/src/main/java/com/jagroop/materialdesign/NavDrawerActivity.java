package com.jagroop.materialdesign;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class NavDrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private static final String TAG = "NavDrawerActivity";

    //Remove style to delete transparency

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);

        setTitle("Navigation Drawer");

        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);
        //drawerLayout.setDrawerListener(toggle);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        switch (id) {
            case R.id.nav_menu_inbox:
                Toast.makeText(this, "Inbox", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_menu_starred:
                Toast.makeText(this, "Starred", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_menu_sent:
                Toast.makeText(this, "Sent", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_menu_draft:
                Toast.makeText(this, "Draft", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_menu_allmail:
                Toast.makeText(this, "All mail", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_menu_trash:
                Toast.makeText(this, "Trash", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_menu_spam:
                Toast.makeText(this, "Spam", Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }
}
