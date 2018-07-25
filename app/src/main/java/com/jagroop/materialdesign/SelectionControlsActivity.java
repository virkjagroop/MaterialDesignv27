package com.jagroop.materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.SwitchCompat;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class SelectionControlsActivity extends AppCompatActivity {

    private Switch switch1;
    private SwitchCompat switch2;
    private TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7;
    private CheckBox checkBox;
    private AppCompatCheckBox checkCompact;
    private RadioButton radioButton, radioButton1, radioButton2, radioButton3;
    private AppCompatRadioButton radioCompact;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_controls);

        switch1 = findViewById(R.id.switch1);
        switch2 = findViewById(R.id.switch2);
        checkBox = findViewById(R.id.checkBox);
        checkCompact = findViewById(R.id.checkCompact);
        radioButton = findViewById(R.id.radioButton);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioCompact = findViewById(R.id.radioCompact);
        radioGroup = findViewById(R.id.radioGroup);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);

        checkStatus();

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView1.setText("ON");
                } else {
                    textView1.setText("OFF");
                }
            }
        });

        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView2.setText("ON");
                } else {
                    textView2.setText("OFF");
                }
            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView3.setText("Checked");
                } else {
                    textView3.setText("Unchecked");
                }
            }
        });

        checkCompact.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView4.setText("Checked");
                } else {
                    textView4.setText("Unchecked");
                }
            }
        });

        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView5.setText("selected");
                } else {
                    textView5.setText("Unselected");
                }
            }
        });

        radioCompact.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView6.setText("selected");
                } else {
                    textView6.setText("Unselected");
                }
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButton1:
                        textView7.setText(radioButton1.getText());
                        break;
                    case R.id.radioButton2:
                        textView7.setText(radioButton2.getText());
                        break;
                    case R.id.radioButton3:
                        textView7.setText(radioButton3.getText());
                        break;
                }

            }
        });
    }

    private void checkStatus(){
        if (switch1.isChecked()) {
            textView1.setText("ON");
        } else {
            textView1.setText("OFF");
        }

        if (switch2.isChecked()) {
            textView2.setText("ON");
        } else {
            textView2.setText("OFF");
        }

        if (checkBox.isChecked()) {
            textView3.setText("Checked");
        } else {
            textView3.setText("Unchecked");
        }

        if (checkCompact.isChecked()) {
            textView4.setText("Checked");
        } else {
            textView4.setText("Unchecked");
        }

        if (radioButton.isChecked()) {
            textView5.setText("selected");
        } else {
            textView5.setText("Unselected");
        }

        if (radioCompact.isChecked()) {
            textView6.setText("selected");
        } else {
            textView6.setText("Unselected");
        }
    }
}
