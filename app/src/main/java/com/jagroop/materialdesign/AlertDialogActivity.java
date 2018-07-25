package com.jagroop.materialdesign;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class AlertDialogActivity extends AppCompatActivity {

    private static final String TAG = "AlertDialogActivity";

    private Handler handler;
    private Runnable runnable;
    private Timer timer;
    private AlertDialog alertDialog;
    private AlertDialog.Builder builder;
    private ProgressDialog progressDialog;
    private int i=0, j;
    private String[] item = {"Red", "Green", "Blue", "Orange"};
    private Button confirmDialog;
    private EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        confirmDialog = findViewById(R.id.confirmDialog);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
    }

    public void alertDialog(View view) {

        builder = new AlertDialog.Builder(this, R.style.AlertDialogTheme);
        builder.setTitle("This is alert dialog")
                .setMessage("Do you confirm to understand alert dialog?")
                .setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.d(TAG, "onClick: Confirm");
                    }
                })
                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.d(TAG, "onClick: Cancel");
                    }
                })
                .setIcon(R.drawable.ic_alert)
                .setCancelable(false)
                .show();

    }

    public void confirmDialog(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("Select any one")
                .setSingleChoiceItems(item, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        j = which;
                    }
                })
                .setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (j == 0) confirmDialog.setTextColor(getResources().getColor(R.color.red));
                        if (j == 1) confirmDialog.setTextColor(getResources().getColor(R.color.green));
                        if (j == 2) confirmDialog.setTextColor(getResources().getColor(R.color.blue));
                        if (j == 3) confirmDialog.setTextColor(getResources().getColor(R.color.orage));
                    }
                })
                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setIcon(R.drawable.ic_starred);

        alertDialog = builder.create();

        //set button color
        /*alertDialog.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(getResources().getColor(R.color.red));
        alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(getResources().getColor(R.color.red));*/

        alertDialog.show();
    }

    public void progressCircle(View view) {
        progressDialog = new ProgressDialog(AlertDialogActivity.this, R.style.AlertDialogTheme);
        progressDialog.setTitle("Waisting your time");
        progressDialog.setMessage("Please wait...");
        progressDialog.show();
    }

    public void progressLinear(View view) {
        progressDialog = new ProgressDialog(AlertDialogActivity.this, R.style.AlertDialogTheme);
        progressDialog.setTitle("Waisting your time");
        progressDialog.setMessage("Please wait...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setIndeterminate(true);
        progressDialog.show();
    }

    public void progressPercent(View view) {
        progressDialog = new ProgressDialog(AlertDialogActivity.this, R.style.AlertDialogTheme);
        progressDialog.setTitle("Waisting your time");
        progressDialog.setMessage("Please wait...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setIndeterminate(false);
        progressDialog.setMax(100);
        progressDialog.setProgress(0);

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                if (++i<=100) {
                    progressDialog.setProgress(i);
                } else {
                    progressDialog.cancel();
                    i = 0;
                }
            }
        };

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(runnable);
            }
        }, 2000, 1000);

        progressDialog.show();
    }

    public void customLayout(View view) {

        LayoutInflater inflater = this.getLayoutInflater();

        builder = new AlertDialog.Builder(this);
        builder.setView(inflater.inflate(R.layout.dialog_layout, null))
                .setPositiveButton("CONFIRM", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        /*Log.d(TAG, "onClick: username " + username.getText().toString());
                        Log.d(TAG, "onClick: password " + password.getText().toString());
                        if (!username.getText().toString().isEmpty() && password.getText().toString().isEmpty()) {
                            if (username.getText().toString().equals("username") && password.getText().toString().equals("password")) {
                                Toast.makeText(AlertDialogActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(AlertDialogActivity.this, "username or password incorrect", Toast.LENGTH_SHORT).show();
                            }
                        }*/
                    }
                })
                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setCancelable(false)
                .show();
    }
}
