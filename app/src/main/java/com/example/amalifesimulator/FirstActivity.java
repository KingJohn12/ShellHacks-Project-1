package com.example.amalifesimulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.FocusFinder;
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


    public void onNextButtonFlipper (View view) {
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
        final EditText firstNameEditText = findViewById(R.id.firstNameEditText);
        final EditText lastNameEditText = findViewById(R.id.lastNameEditText);

        firstNameEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!b) {
                    firstName = firstNameEditText.getText().toString();
                }
            }
        });

        lastNameEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (!b) {
                    lastName = lastNameEditText.getText().toString();
                }
            }
        });

        viewFlipper.showNext();

        TextView helloTextView = findViewById(R.id.helloTextView);

        String temp = "Hello " + firstName + " " + lastName + "!";
        helloTextView.setText(temp);
    }

    public void onNextButtonFourth (View view) {
        viewFlipper.showNext();
//        Intent intent = new Intent(this, MainActivity.class);
//
//        intent.putExtra("firstName", firstName);
//        intent.putExtra("lastName", lastName);
//        intent.putExtra("choice", choice);
//        startActivity(intent);
    }
}