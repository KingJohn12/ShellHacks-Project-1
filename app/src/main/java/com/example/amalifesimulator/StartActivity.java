package com.example.amalifesimulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class StartActivity extends AppCompatActivity {
    private Integer sex;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_start);

//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void startNewLife (View view) {
        String firstName, lastName;
        Intent intent = new Intent (this, MainActivity.class);

        EditText firstNameTextField = findViewById(R.id.firstNameTextField);
        EditText lastNameTextField = findViewById(R.id.lastNameTextField);

        firstName = firstNameTextField.getText().toString();
        lastName = lastNameTextField.getText().toString();

        intent.putExtra("firstName", firstName);
        intent.putExtra("lastName", lastName);
        intent.putExtra("sex", sex);
        startActivity(intent);
    }

    public void onRadioButtonClicked (View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.maleRadioButton:
                if(checked)
                    sex = new Integer(0);
                break;
            case R.id.femaleRadioButton:
                if(checked)
                    sex = new Integer(1);
                break;
        }
    }
}