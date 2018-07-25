package com.jagroop.materialdesign;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SnakbarActivity extends AppCompatActivity {

   Snackbar snackbar;
    Button snackbarCoordinator;
    FloatingActionButton fabSnackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snakbar);

        fabSnackbar = findViewById(R.id.fabSnackbar);

        final View view = findViewById(R.id.snakbarActivity);

        snackbarCoordinator = findViewById(R.id.snackbarCoordinator);
        snackbarCoordinator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ExtraActivity.class);
                startActivity(intent);
            }
        });

        fabSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(view,"Snackbar with long duration", Snackbar.LENGTH_LONG).show();
            }
        });


    }

    public void snackbarLong(View view) {
        Snackbar.make(view,"Snackbar with long duration", Snackbar.LENGTH_LONG).show();
    }

    @SuppressLint("ResourceAsColor")
    public void snackbarIndefinite(View view) {
        snackbar = Snackbar.make(view,"Snackbar with indefinite duration", Snackbar.LENGTH_INDEFINITE);
        snackbar.setAction("HIDE", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
        snackbar.setActionTextColor(getResources().getColor(R.color.greenLight));

        View v = snackbar.getView();
        v.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

        TextView textView = v.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(getResources().getColor(R.color.redLight));

        snackbar.show();

    }

    public void snackbarCustom(View view) {
        snackbar = Snackbar.make(view,"Snackbar with indefinite duration", Snackbar.LENGTH_INDEFINITE);
        snackbar.setDuration(5000);
        snackbar.show();

    }
}
