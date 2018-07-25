package com.jagroop.materialdesign;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ExtraActivity extends AppCompatActivity {

    FloatingActionButton fabSnackbar;
    Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);

        final View view = findViewById(R.id.extraActivity);

        fabSnackbar = findViewById(R.id.fabSnackbar);
        fabSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar = Snackbar.make(view,"Snackbar coordinator", Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        });
    }
}
