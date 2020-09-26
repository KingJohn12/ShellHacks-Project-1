package com.example.amalifesimulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class FirstActivity extends AppCompatActivity {
    private Integer choice;
    private String firstName;
    private String lastName;
    private ViewFlipper viewFlipper;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_first);

        viewFlipper = findViewById(R.id.viewFlipperStart);

//        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }


    public void onNextButtonFirst (View view) {
        viewFlipper.showNext();
    }

    public void onRadioButtonClicked (View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.firstPersonRadioButton:
                if (checked)
                    choice = new Integer(0);
                break;
            case R.id.secondPersonRadioButton:
                if (checked)
                    choice = new Integer(1);
                break;
            case R.id.thirdPersonRadioButton:
                if (checked)
                    choice = new Integer(2);
                break;
            case R.id.fourthPersonRadioButton:
                if (checked)
                    choice = new Integer(3);
                break;
        }
    }

    public void onNextButtonSecond (View view) {
        EditText firstNameEditText = findViewById(R.id.firstNameEditText);
        EditText lastNameEditText = findViewById(R.id.lastNameEditText);

        firstNameEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if ()
            }
        });

        lastNameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                lastName = lastNameEditText.getText().toString();
            }
        });

        viewFlipper.showNext();
    }

    public void onNextButtonThird (View view) {
        viewFlipper.showNext();

        TextView helloTextView = findViewById(R.id.helloTextView);

        String temp = "Hello " + firstName + " " + lastName + "!";
        helloTextView.setText(temp);
    }
}