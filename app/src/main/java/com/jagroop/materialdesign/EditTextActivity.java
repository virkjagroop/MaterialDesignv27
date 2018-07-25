package com.jagroop.materialdesign;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RelativeLayout;

public class EditTextActivity extends AppCompatActivity {

    RelativeLayout editText;
    AppCompatEditText userFirstName, userLastName;
    TextInputLayout layoutFirstName, layoutLastName, layoutPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        editText = findViewById(R.id.editText);
        userFirstName = findViewById(R.id.userFirstName);
        userLastName = findViewById(R.id.userLastName);
        layoutFirstName = findViewById(R.id.layoutFirstName);
        layoutLastName = findViewById(R.id.layoutLastName);
        layoutPassword = findViewById(R.id.layoutPassword);


        // to remove foxus from all fields
        editText.setOnClickListener(null);

        //text change listner
        userFirstName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //checking for empty text field
                if (userFirstName.getText().toString().isEmpty()) {
                    layoutFirstName.setErrorEnabled(true);
                    layoutFirstName.setError("Please enter first name");
                } else {
                    layoutFirstName.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //focus change listner
        userLastName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                //checking for empty text field
                if (!hasFocus && userLastName.getText().toString().isEmpty()) {
                    layoutLastName.setErrorEnabled(true);
                    layoutLastName.setError("Please enter last name");
                } else {
                    layoutLastName.setErrorEnabled(false);
                }
            }
        });

        //set character count on password field
        layoutPassword.setCounterEnabled(true);
        layoutPassword.setCounterMaxLength(8);
    }
}
